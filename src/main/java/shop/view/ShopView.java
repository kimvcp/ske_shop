package shop.view;

import shop.controller.ShopController;
import java.util.Scanner;

/**
 * A class representing of shop's information, such as catalog, command, receipt.
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
     * Handler for printing command.
     */
    public void printCommnand() {

        while (true) {
            System.out.println();
            System.out.print("Enter your choice: ");
            String choice = console.next();

            if (choice.equals("c")) {
                cancelOrder();
            }
            else if (choice.equals("e")) {
                printReceipt();
                break;
            }
            else if (choice.charAt(0) > 48 && choice.charAt(0) < 57) {
                orderHandler(choice);
            } else {
                System.out.println("Command not found");
            }
        }
    }
}
