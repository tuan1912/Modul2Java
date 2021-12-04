package service;

import config.ConfigReadAndWrite;
import model.Product;
import java.util.Comparator;
import java.util.List;

public class ProductServiceImpl implements IProductService  {
    public static String PATH = "C:\\Users\\Administrator\\Desktop\\Modul2\\lesson16-io-text-file\\src\\file\\products.txt";
    ConfigReadAndWrite<Product> configReadAndWrite = new ConfigReadAndWrite<>();
    public List<Product> products = configReadAndWrite.readFromFile(PATH);

    public ProductServiceImpl() {
    try {
        if(!products.isEmpty())
        {
            int maxId = 0;
            for (int i = 0; i < products.size(); i++) {
                if(products.get(i).getProductId()> maxId) maxId = products.get(i).getProductId();
            }
            Product.id = maxId;
        }
    }catch (ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    }

    }

    @Override
    public void writeToFile() {
        configReadAndWrite.writeToFile(PATH, products);
    }

    @Override

    public List<Product> findAll() {
        return products;
    }

    @Override
    public void createNewProduct(String name, int price, int quantity) {
        Product productNew = new Product(name, price, quantity);
        products.add(productNew);
        writeToFile();
    }

    @Override
    public int getIndexByProductId(int productId) {
        int NOT_EXIST_ID = -1;
        for (int i = 0; i < products.size(); i++) {
            boolean isProductId = products.get(i).getProductId() == productId;
            if (isProductId) {
                return i;
            }
        }
        return NOT_EXIST_ID;
    }

    @Override
    public void removeProduct(int index) {
        products.remove(index);
        writeToFile();
    }

    @Override
    public void changeDescription(int index, String description) {
        products.get(index).setDescription(description);
        writeToFile();

    }

    @Override
    public void changeProductInformation(int index, String name, int price, int quantity) {
        Product productUpdate = products.get(index);
        productUpdate.setName(name);
        productUpdate.setPrice(price);
        productUpdate.setQuantity(quantity);
        writeToFile();
    }

    @Override
    public void sortByPrice() {
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity);
        products.sort(comparator);
        writeToFile();
    }

    @Override
    public void sortByName() {
        Comparator<Product> comparatorByName = Comparator.comparing(Product::getName).thenComparing(Product::getProductId);
        products.sort(comparatorByName);
        writeToFile();
    }


}
