/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_controlflowpart2_loopingandjump;

/**
 *
 * @author yvonne
 */
import java.util.Scanner;
public class EXPERT {

    /**
     * @param args the command line arguments
     */
         static Scanner input = new Scanner(System.in);

    static int[][] stocks = {
        {30, 12, -2},
        {15, 23, 9},
        {8, -1, 3}
    };

    public static void main(String[] args) {
         // TODO code application logic here
        int choice;

        do {
            System.out.println("\n=== WAREHOUSE STOCK CHECKER ===");
            System.out.println("1. View Stocks");
            System.out.println("2. Count All Stocks");
            System.out.println("3. Check Low Stocks");
            System.out.println("4. Add Stocks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    showStocks();
                    break;

                case 2:
                    countStocks();
                    break;

                case 3:
                    checkLowStock();
                    break;

                case 4:
                    addStocks();
                    break;

                case 5:
                    System.out.println("Thank you! Closing the stock checker.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }

    static void showStocks() {
        System.out.println("\n--- Warehouse Stocks ---");

        for (int row = 0; row < stocks.length; row++) {
            for (int col = 0; col < stocks[row].length; col++) {
                if (stocks[row][col] < 0) {
                    System.out.print("[DAMAGED] ");
                } else {
                    System.out.print(stocks[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    static void countStocks() {
        int total = 0;

        for (int row = 0; row < stocks.length; row++) {
            for (int col = 0; col < stocks[row].length; col++) {
                if (stocks[row][col] < 0) {
                    continue;
                }

                total += stocks[row][col];
            }
        }

        System.out.println("Total Available Stocks: " + total);
    }

    static void checkLowStock() {
        boolean found = false;

        for (int row = 0; row < stocks.length; row++) {
            for (int col = 0; col < stocks[row].length; col++) {
                if (stocks[row][col] < 0) {
                    continue;
                }

                if (stocks[row][col] < 10) {
                    System.out.println("\nLow Stock Found!");
                    System.out.println("Shelf Row: " + (row + 1));
                    System.out.println("Shelf Column: " + (col + 1));
                    System.out.println("Remaining Stocks: " + stocks[row][col]);

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No low stocks found.");
        }
    }

    static void addStocks() {
        System.out.print("Enter shelf row (1-3): ");
        int row = input.nextInt() - 1;

        System.out.print("Enter shelf column (1-3): ");
        int col = input.nextInt() - 1;

        if (row < 0 || row >= stocks.length ||
            col < 0 || col >= stocks[row].length) {
            System.out.println("Invalid shelf location.");
            return;
        }

        if (stocks[row][col] < 0) {
            System.out.println("This shelf is damaged. You cannot add stocks.");
            return;
        }

        int amount;

        while (true) {
            System.out.print("Enter the number of stocks to add: ");
            amount = input.nextInt();

            if (amount > 0) {
                break;
            }

            System.out.println("Please enter a number greater than zero.");
        }

        stocks[row][col] += amount;

        System.out.println("Stocks added successfully!");
        System.out.println("Updated Stock Count: " + stocks[row][col]);
   

    } // Ends the main method.
} // Ends the class.
