package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    List<Product> products = new ArrayList<>() ;
    void writeToFile();
    List<Product> findAll();
    void createNewProduct(String name, int price, int quantity);
    int getIndexByProductId(int productId);
    void removeProduct(int index);
    void changeDescription(int index,  String description);
    void changeProductInformation(int index, String name, int price, int quantity);
    void sortByPrice();
    void sortByName();
}
