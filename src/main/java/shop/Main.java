package shop;

import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static ProductCatalog catalog = ProductCatalog.getInstance();
    static Order order = new Order();
    static int id = 0;

    public static void main(String[] arg) {
        initialize();
        menu();
        command();

    }

    static void initialize() {
        catalog.addProduct("Bread", 20);
        catalog.addProduct("Ham", 50);
    }

    static void menu() {
        System.out.println("WELCOME TO THE SKE SHOP");
        for (Map.Entry<String, Product> element : catalog.getProductCatalog().entrySet()) {
            String Key = element.getKey();
            Product value = element.getValue();
            System.out.println(Key);
            System.out.println(value);
        }


        System.out.println();
        System.out.println(" [e] edit your order");
        System.out.println(" [c] Review order and Checkout");

    }


    static void command() {

        while (true) {
            System.out.println();
            System.out.print("Enter your Choice: ");
            String choice = console.next();
            if (choice.equals("p")) {

            } else if (choice.equals("e")) {
                break;
            }
            if (choice.charAt(0) > 48 && choice.charAt(0) < 57) {
                int choicenum = Integer.parseInt(choice);
                System.out.print("Enter you Quantity: ");
                int quan = console.nextInt();
            }


        }
    }
}
