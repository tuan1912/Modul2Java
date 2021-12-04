package model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    public static int id = 0;
    private int productId;
    private String name;
    private int price;
    private Date date;
    private int quantity;
    private String description = "breakable";

    public Product() {

    }

    public Product(String name, int price, int quantity) {
        this.productId = ++id;
        this.name = name;
        this.price = price;
        this.date = new Date();
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", quantity=" + quantity +
                ", discription= " + description +
                '}';
    }

}
