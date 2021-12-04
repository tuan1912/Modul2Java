package view;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ProductView productView = new ProductView();

    public Main() {
        System.out.println("1. Show all of product\n" +
                "2. Create new product\n" +
                "3. Delete product\n" +
                "4. Change product information\n" +
                "5. Sort by price\n" +
                "6. Sort by name\n" +
                "0. Exit");

        switch (productView.chooseMenu()) {
            case 1:
                productView.showProducts();
                productView.goMenuOrQuit();
                break;
            case 2:
                productView.createNewProduct();
                productView.goMenuOrQuit();
                break;
            case 3:
                productView.removeProductbByProductId();
                productView.goMenuOrQuit();
                break;
            case 4:
                productView.changeProductInformation();
                productView.goMenuOrQuit();
                break;
            case 5:
                productView.sortByPrice();
                productView.goMenuOrQuit();
                break;
            case 6:
                productView.sortByName();
                productView.goMenuOrQuit();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        new Main();

    }



}
