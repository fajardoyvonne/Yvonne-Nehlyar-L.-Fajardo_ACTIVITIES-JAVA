/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4_controlflowpart2_loopingandjump;

/**
 *
 * @author yvonne
 */

// import: brings in Scanner, a tool that reads what the person types.
import java.util.Scanner;

public class WEEK4_ControlFlowPart2_LoopingAndJump {

    public static void main(String[] args) {

        //BASIC
        //THE LOOP LIMIT
        // int: a whole number. The loop counts from 1 up to this number.
        int limit = 10;

        System.out.println("~~~ BASIC: Number & Square Printer (1 to " + limit + ") ~~~");  // Shows the header

        //LOOP FROM 1 TO 10
        // for loop: repeats the code inside again and again.
        // It has 3 parts: start, keep going while true, change after each round.
        // int number = 1   (start the counter at 1.)
        // number <= limit  (keep looping while number is 10 or less.)
        // number++         (add 1 to the counter after each round.)
        for (int number = 1; number <= limit; number++) {

            // number * number is the square (the number times itself).
            // Everything is printed on one line, with a label for each value.
            System.out.println("Number: " + number + " | Square: " + (number * number));
        }

        //CHANGE THE LOOP BOUND TO 20
        // Only the limit changes. The loop code stays exactly the same.
        limit = 20;

        System.out.println("\n~~~ BASIC: Number & Square Printer (1 to " + limit + ") ~");  // Shows the header

        // The same for loop. It now keeps going until number reaches 20.
        for (int number = 1; number <= limit; number++) {

            // Prints the number and its square on the same line.
            System.out.println("Number: " + number + " | Square: " + (number * number));
        } 

        //INTERMEDIATE
        //THE SETUP
        // Scanner: the tool that reads typed input. System.in means "the keyboard".
        Scanner input = new Scanner(System.in);

        // int: a whole number. The running total starts at 0.
        int total = 0;

        System.out.println("\n~~~ INTERMEDIATE: Sum Until Sentinel Value ~");  //header

        //READ THE FIRST NUMBER
        // print (not println): shows the message and stays on the same line.
        System.out.print("Enter a number (-1 to stop): ");

        // nextInt(): waits for the person to type a whole number, then saves it.
        int number = input.nextInt();

        //THE WHILE LOOP
        // while loop: keeps repeating as long as the condition is true.
        // != means "not equal to". The sentinel (the special stop value) is -1.
        // The check happens BEFORE adding, so -1 is never added to the total.
        while (number != -1) {

            // += adds the number to the running total.
            // Other negative numbers (like -7) ARE added, because only -1 stops the loop.
            total += number;

            // Ask for the next number. Without this line, the loop would never end.
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();    // Saves the new number, and the loop checks it again
        }

        //THE FINAL TOTAL
        // The loop is over, so -1 was entered. Now show the total.
        System.out.println("Final Total: " + total);   // Shows the final total

        // close(): tells Java we are finished with the Scanner.
        input.close();
        
        
        //ADVANCED
        //THE SETTINGS 
        // int: a whole number. The pattern is a square, 7 rows tall and 7 columns wide.
        int size = 7;

        // int: a whole number. The break happens once a value goes above this number.
        int stopValue = 21;

        // int: a whole number. The continue skips this column number.
        int skipColumn = 7;

        System.out.println("\n~~~ ADVANCED: Pattern Generator With Early Exit ~~~");  // Shows the header

        //THE NESTED LOOPS 
        // OUTER LOOP: goes through the rows, from row 1 to row 7.
        for (int row = 1; row <= size; row++) {

            // INNER LOOP: goes through the columns of ONE row, from column 1 to column 7.
            // It starts over for every new row.
            for (int col = 1; col <= size; col++) {

               
                // break: stops the inner loop right away, and Java moves on to the next row.
                // row * col is the value for this spot. If it is bigger than 21, we stop this row early.
                // Only the inner loop stops. The outer loop keeps going.
                if (row * col > stopValue) {
                    break;                       //thia line is break
                }

                
                // continue: skips the rest of THIS round only, then the loop goes on to the next column.
                // When col is 7, the print line below is skipped, so column 7 never shows.
                if (col == skipColumn) {
                    continue;                   //this line is continue 
                }

                
                // print (not println) keeps everything on the same line.
                System.out.print(row * col + "\t");
            }

            // After the inner loop ends (normally or by break), println moves to the next line.
            System.out.println();
        }
        
 
    } // Ends the main method.
} // Ends the class.
