package shop;

import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static ProductCatalog catalog = ProductCatalog.getInstance();
    static Order order = new Order();
    static int id = 0;

    static void initialize() {
        catalog.addProduct("Bread", 20);
        catalog.addProduct("Ham", 50);
    }

    static void menu() {
        System.out.println("__________ WELCOME TO THE SKE SHOP __________\n");
        System.out.printf("  %s%36s\n", "Product", "Price");
        int index = 1;
        for (Map.Entry<String, Product> element : catalog.getProductCatalog().entrySet()) {
            Product value = element.getValue();
            System.out.printf(" [%d] %-20s%20.2f\n", index, value.getName(), value.getPrice());
            index++;
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

            if (choice.equals("c")) {
                receipt();
                break;
            }
            if (choice.charAt(0) > 48 && choice.charAt(0) < 57) {
                int choicenum = Integer.parseInt(choice);
                System.out.print("Enter you Quantity: ");
                int quan = console.nextInt();

                System.out.println();
            }


        }
    }
    public static void receipt() {
        System.out.println();
        System.out.println(" _______________ SKE RECEIPT ________________");
        System.out.println();
        System.out.println(" Facebook Page : skeskeshop");
        System.out.println(" Tel : 02-021-0200");
        System.out.println();
        System.out.printf(" %27s\n", "Bill Check");
        System.out.println();
        System.out.printf(" %s%31s%tT\n", "Time:", "", System.currentTimeMillis());
        System.out.println(" --------------------------------------------");
        System.out.printf(" %8s%31s%s\n", "Product", "", "Price");
        System.out.println(" --------------------------------------------");
        int index = 1;
            index++;
        System.out.println(" --------------------------------------------");
        System.out.printf(" %8s%18.2f\n", "Total Price (VAT included)", order.getTotal());
        System.out.println(" ____________________________________________");
    }

    public static void main(String[] arg) {
        initialize();
        menu();
        command();

    }
}
