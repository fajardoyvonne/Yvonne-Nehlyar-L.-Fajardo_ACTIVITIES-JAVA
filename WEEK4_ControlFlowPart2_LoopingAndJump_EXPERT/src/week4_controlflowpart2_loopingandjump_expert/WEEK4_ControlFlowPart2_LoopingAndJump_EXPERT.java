/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_controlflowpart2_loopingandjump_expert;

/**
 *
 * @author yvonne
 */
// import: brings in Scanner, a tool that reads what the person types.
import java.util.Scanner;

public class WEEK4_ControlFlowPart2_LoopingAndJump_EXPERT {

    //FIND THE FIRST CRITICALLY LOW SHELF
    // A method is a reusable block of code. This one searches the warehouse.
    // It gives back (returns) the shelf's row and column as two numbers. {-1, -1} means "none found".
    public static int[] findFirstLowShelf(int[][] warehouse, int lowLimit) {

        int foundRow = -1;     // Row of the shelf we find. -1 means "not found yet".
        int foundCol = -1;     // Column of the shelf we find.

        // OUTER LOOP: goes through the rows, from the first row to the last.
        for (int row = 0; row < warehouse.length; row++) {

            // INNER LOOP: goes through the shelves in one row.
            for (int col = 0; col < warehouse[row].length; col++) {

                // A damaged shelf (-1) is skipped. It must not count as "low".
                if (warehouse[row][col] == -1) {
                    continue;  // Skips this shelf and goes to the next one
                }

                // Critically low means the count is the limit (7) or fewer.
                if (warehouse[row][col] <= lowLimit) {
                    foundRow = row;  // Remember where we found it
                    foundCol = col;
                    break;  //stops the inner loop
                }
            }

            // If we already found a shelf, stop the outer loop too, so we keep the FIRST one.
            if (foundRow != -1) {
                break;   //stops the outer loop
            }
        }

        // return: sends the answer back to the code that called this method.
        return new int[] {foundRow, foundCol};
    }

    //ASK FOR A VALID RESTOCK AMOUNT
    // This method keeps asking until the person types a number above 0.
    public static int readRestockAmount(Scanner keyboard) {

        System.out.print("Enter the restock amount (more than 0): ");
        int amount = keyboard.nextInt();   // Reads the typed number

        // while loop: input validation. It repeats while the amount is not valid (0 or less).
        while (amount <= 0) {
            System.out.print("Invalid amount. Enter a number more than 0: ");
            amount = keyboard.nextInt(); // Asks again
        }

        // return: the loop only ends when the amount is valid, so we send it back.
        return amount;
    }

    // main: the starting point. Java begins running here.
    public static void main(String[] args) {

        //THE WAREHOUSE (2D ARRAY)

        // 2D array: a table of numbers, with rows and columns. Each number is the item count on one shelf.
        // -1 means a damaged shelf.
        int[][] warehouse = {
            {21, 21, -1},     // Row 1
            {21,  7, 21},     // Row 2
            {-1, 21,  7}      // Row 3
        };

        // int: a whole number. A shelf with this many items or fewer is critically low.
        int lowLimit = 7;

        // Scanner: the tool that reads typed input.
        Scanner keyboard = new Scanner(System.in);

        int menuChoice;       // Stores the option the person picks

        System.out.println("~ EXPERT: Warehouse Inventory Scanner ~");  // Shows the header

        //THE DO-WHILE MENU

        // do-while: runs the menu AT LEAST ONCE, then repeats while the choice is not 4 (Exit).
        do {

            // Shows the menu.
            System.out.println("\n--- MENU ---");
            System.out.println("1. Show total inventory");
            System.out.println("2. Find the first critically low shelf");
            System.out.println("3. Restock the first critically low shelf");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            menuChoice = keyboard.nextInt(); // Reads the option

            // switch: jumps to the case that matches the option number.
            switch (menuChoice) {

                case 1: {
                    // 1. INVENTORY (FOR LOOP WITH CONTINUE)

                    int grandTotal = 0;           // The running total starts at 0
                    int damagedCount = 0;         // Counts the damaged shelves we skip

                    // Goes through every row, and then every shelf in the row.
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0; col < warehouse[row].length; col++) {

                            // If the shelf is damaged (-1), skip it so it is not added to the total.
                            if (warehouse[row][col] == -1) {
                                damagedCount++;   // Counts the skipped shelf
                                continue;         // this line is the continue
                            }

                            grandTotal += warehouse[row][col];   // Adds the shelf count to the total
                        }
                    }

                    System.out.println("Total inventory: " + grandTotal + " (" + damagedCount + " damaged shelves skipped)");
                    break;                        // break here ends this switch case
                }

                case 2: {
                    // 2. FIND THE FIRST CRITICALLY LOW SHELF

                    int[] lowShelf = findFirstLowShelf(warehouse, lowLimit);   // Calls the search method

                    if (lowShelf[0] == -1) {
                        System.out.println("No critically low shelf found.");
                    } else {
                        // + 1 because people count rows and columns from 1, but arrays count from 0.
                        System.out.println("First critically low shelf: row " + (lowShelf[0] + 1)
                                + ", column " + (lowShelf[1] + 1)
                                + " (count: " + warehouse[lowShelf[0]][lowShelf[1]] + ")");
                    }
                    break;
                }

                case 3: {
                    // 3. RESTOCK (WHILE LOOP AND RETURN, IN THE RESTOCK METHOD)

                    int[] restockShelf = findFirstLowShelf(warehouse, lowLimit);   // Finds the shelf to restock

                    if (restockShelf[0] == -1) {
                        System.out.println("No critically low shelf to restock.");
                    } else {
                        int amount = readRestockAmount(keyboard);                   // Asks for a valid amount
                        warehouse[restockShelf[0]][restockShelf[1]] += amount;      // Adds the amount to the shelf

                        System.out.println("Restocked row " + (restockShelf[0] + 1)
                                + ", column " + (restockShelf[1] + 1)
                                + ". New count: " + warehouse[restockShelf[0]][restockShelf[1]]);
                    }
                    break;
                }

                case 4:
                    // 4. EXIT
                    System.out.println("Thank you and Goodbye!");
                    break;

                default:
                    // default: runs when the number is not 1, 2, 3, or 4.
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
                    break;
            }

        } while (menuChoice != 4);    // Repeats the menu until the person picks 4

        // close(): tells Java we are finished with the Scanner.
        keyboard.close();

    } // Ends the main method.
} // Ends the class.