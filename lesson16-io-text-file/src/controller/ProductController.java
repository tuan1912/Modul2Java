package controller;

import model.Product;
import service.ProductServiceImpl;


import java.util.List;

public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();
    public List<Product> findAll() {
        return productService.findAll();
    }

    public void createNewProduct( String name, int price, int quantity) {
        productService.createNewProduct(name,price,quantity);
    }
    public int getIndexByProductId(int productId) {
        return productService.getIndexByProductId(productId);
    }
    public void removeProduct(int index) {
        productService.removeProduct(index);
    }
    public void changeDescription(int index, String description) {
        productService.changeDescription(index,description);
    }
    public void changeProductInformation(int index, String name, int price, int quantity) {
        productService.changeProductInformation(index,name,price,quantity);
    }
    public void sortByPrice() {
        productService.sortByPrice();
    }
    public void sortByName(){
        productService.sortByName();
    }

}
