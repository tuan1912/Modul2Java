package view;

import controller.ProductController;
import exception.DescriptionIsTooLong;
import exception.NotAPositiveInteger;
import model.Product;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductView {
    ProductController productController = new ProductController();
    Scanner scanner = new Scanner(System.in);

    public void goMenuOrQuit() {
        System.out.println("Enter 'quit' or anyone else ");
        String nextChoice = scanner.nextLine();
        if (!nextChoice.equalsIgnoreCase("quit")) {
            new Main();
        } else {
            System.exit(0);
        }
    }

    public int chooseMenu() {
        int choiceNumber = enterIntegerNumber();
        boolean isChoiceNumber = choiceNumber < 7 && choiceNumber >= 0;
        if (isChoiceNumber) return choiceNumber;
        else {
            System.out.println("Enter your choice, again:");
            return chooseMenu();
        }
    }

    public int enterIntegerNumber() {
        int inputNumber;
        try {
            inputNumber = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Oops! Must be \"integer\"\n");
            System.out.println("Re-type:");
            return enterIntegerNumber();
        }
        return inputNumber;
    }

    public void createNewProduct() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter price:");
        int price = enterPositiveInteger();
        System.out.println("Enter quantity:");
        int quantity = enterPositiveInteger();
        productController.createNewProduct(name, price, quantity);
        System.out.println("Enter description:");
        String description = enterDescription();
        int lastIndex = productController.findAll().size() - 1;
        productController.changeDescription(lastIndex, description);
    }

    public int enterPositiveInteger() {
        try {
            int integerNumber = enterIntegerNumber();
            boolean isNegativeNumber = integerNumber < 0;
            if (isNegativeNumber) throw new NotAPositiveInteger("Not a positive integer");
            else return integerNumber;
        } catch (NotAPositiveInteger e) {
            e.getErrorMessage();
            System.out.println("Re-type positive integer:");
            return enterPositiveInteger();
        }
    }

    public String enterDescription() {
        String description;
        String regex = "[\\w\\W]{0,100}";
        Pattern pattern = Pattern.compile(regex);
        try {
            description = scanner.nextLine();
            Matcher matcher = pattern.matcher(description);
            boolean match = matcher.matches();
            if (match) {
                return description;
            } else throw new DescriptionIsTooLong("Description is too long!");
        } catch (DescriptionIsTooLong e) {
            e.getErrorMessage();
            System.out.println("Re-type description: ");
            return enterDescription();
        }
    }

    public void showProducts() {
        for (Product e : productController.findAll()) {
            System.out.println(e);
            String inputRandom = scanner.nextLine();
        }
    }

    public void removeProductbByProductId() {
        System.out.println("Enter product id you wanna delete:");
        int removeProductById = enterIntegerNumber();
        int indexOfRemoveId = productController.getIndexByProductId(removeProductById);
        boolean isProductId = indexOfRemoveId > -1;
        if (isProductId) productController.removeProduct(indexOfRemoveId);
        else System.out.println("Id doesn't exist!");
    }

    public void changeProductInformation() {
        System.out.println("Enter product id you wanna change:");
        int changeInformationById = enterIntegerNumber();
        int changeInformationByIndex = productController.getIndexByProductId(changeInformationById);
        if (changeInformationByIndex > -1) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter price:");
            int price = enterPositiveInteger();
            System.out.println("Enter quantity:");
            int quantity = enterPositiveInteger();
            productController.changeProductInformation(changeInformationByIndex, name, price, quantity);
            System.out.println("Enter description:");
            String description = enterDescription();
            productController.changeDescription(changeInformationByIndex, description);
        }
    }

    public void sortByPrice() {
        productController.sortByPrice();
    }

    public void sortByName() {
        productController.sortByName();
    }




}
