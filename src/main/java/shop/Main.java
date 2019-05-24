package shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        ProductCatalog catalog = ProductCatalog.getInstance();
        catalog.addProduct("kim", 100);
        System.out.println(catalog.getProduct("kim").getName());
    }

    public void command() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println();
            String choice = getStringReply("Enter your Choice: ");
            if (choice.equals("p"))
                printTotalMenu();
            else if (choice.equals("e"))
                editMenu();
            else if (choice.equals("x"))
                cancelMenu();
            else if (choice.equals("c")) {
                receipt();
                try {
                    manage.recordOrder(order, totalPrice());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            }
            if (choice.charAt(0) > 48 && choice.charAt(0) < 57) {
                int choicenum = Integer.parseInt(choice);
                int quan = getIntReply("Enter you Quantity: ");
                order[choicenum - 1] += quan;
            }

        }
    }
}
