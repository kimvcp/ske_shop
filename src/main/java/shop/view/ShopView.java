package shop.view;

import shop.controller.ShopController;

import java.util.Scanner;

/**
 * A class representing view of shop in the console.
 */
public class ShopView extends ShopController {
    /**
     * Scanner for receiving input of user
     */
    private Scanner console;

    public ShopView() {
        console = new Scanner(System.in);
    }

    /**
     * Displaying the product catalog.
     */
    public void displayCatalog() {
        initCatalog();
        System.out.println("__________ WELCOME TO THE SKE SHOP __________\n");
        System.out.printf("  %s%36s\n", "Product", "Price");
        printProducts();
        System.out.println();
        System.out.println(" [c] Cancel order");
        System.out.println(" [e] Review order and checkout");
    }

    /**
     * Displaying the command which require a handler for each command.
     */
    public void displayCommand() {

        while (true) {
            System.out.println();
            System.out.print("Enter your choice: ");
            String choice = console.next();

            if (choice.equals("c")) {
                cancelOrderHandler();
            }
            else if (choice.equals("e")) {
                receiptHandler();
                break;
            }
            else if (choice.charAt(0) > 48 && choice.charAt(0) < 57) {
                orderHandler(choice);
            } else {
                System.out.println("Command not found");
            }
        }
    }

    public void show(){
        displayCatalog();
        displayCommand();
    }
}
