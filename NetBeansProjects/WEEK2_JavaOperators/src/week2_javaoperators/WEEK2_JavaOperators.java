/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2_javaoperators;

/**
 *
 * @author yvonne
 */
public class WEEK2_JavaOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
      //BASIC   
      //THE TWO NUMBERS

        // int: a whole number. This is the first number.
        int num1 = 21;

        // int: a whole number. This is the second number.
        int num2 = 7;

        System.out.println("~~~ BASIC: Four-Function Calculator ~~~");  // Shows the header
        System.out.println("First Number: " + num1);  // Shows 21
        System.out.println("Second Number: " + num2); // Shows 7

        //THE FIVE OPERATORS

        // + adds the two numbers: 21 + 7 = 28.
        System.out.println("Addition (+): " + (num1 + num2));  // Shows 28

        // - subtracts the second number from the first: 21 - 7 = 14.
        System.out.println("Subtraction (-): " + (num1 - num2));  // Shows 

        // * multiplies the two numbers: 21 x 7 = 148.
        System.out.println("Multiplication (*): " + (num1 * num2)); // Shows 148

        // divides the first number by the second: 21 / 7 = 3.
        System.out.println("Division (/): " + (num1 / num2));   // Shows 3

        // % gives the remainder after dividing: 7 fits into 21 exactly 3 times,so nothing is left over.
        System.out.println("Remainder (%): " + (num1 % num2));   // Shows 2

        // NEGATIVE NUMBERS: Only division (/) and remainder (%) behave differently when a number is negative. 
        // Addition, subtraction, and multiplication just follow the normal math rules.
        // For division, Java cuts off the decimal toward zero (-2.857 becomes -2, not -3).
        // For remainder, the answer takes the sign of the FIRST number (-20 % 7 is -6, not )1.

        //NEGATIVE NUMBER EXAMPLE
        // int: a negative whole number, to show the note above.
        int negative = -20;

        System.out.println("\n~~~ BASIC: Negative Operand Example ~~~");   // Header
        System.out.println("Number: " + negative + " and " + num2);  // Shows -20 and 7
        System.out.println("Division (/): " + (negative / num2));    // Shows -2
        System.out.println("Remainder (%): " + (negative % num2));   // Shows -6
        
        // INTERMEDIATE
        // THE STUDENT'S DETAILS

        // int: a whole number. Stores the student's average grade.
        int average = 21;

        // int: a whole number. Stores how many days the student was absent.
        int absences = 7;

        System.out.println("\n~~~ INTERMEDIATE: Grade Threshold Checker ~~~");  // Shows the header
        System.out.println("Average Grade: " + average); // Shows 21
        System.out.println("Absences: " + absences);     // Shows 7

        // CHECKING THE REASONING

        // >= means "greater than or equal to". <= means "less than or equal to".
        // Each line below gives true or false. boolean: only true or false.
        boolean goodAverage = average >= 75;  // true if the average is 75 or higher
        boolean fewAbsences = absences <= 3;  // true if absences are 3 or fewer
        boolean excellent = average >= 90;    // true if the average is 90 or higher

        // && means AND: both sides must be true.
        // || means OR: only one side needs to be true.
        // The brackets make Java check (average >= 75 AND absences <= 3) first.
        // Then the result is joined with OR average >= 90, so a very high average passes no matter the absences.
        boolean passes = (average >= 75 && absences <= 3) || average >= 90;

        System.out.println("\n~~~ INTERMEDIATE: PASS OR FAIL Reasoning ~~~");   // Header
        System.out.println("Average is 75 or higher: " + goodAverage); // Shows false
        System.out.println("Absences are 3 or fewer: " + fewAbsences); // Shows false
        System.out.println("Average is 90 or higher: " + excellent);   // Shows false

        //PASS OR FAIL 

        // if: runs the code inside { } only when passes is true.
        if (passes) {
            System.out.println("\nResult: PASS");   // Shows PASS
            System.out.println("Reason: the student met the rule (75+ with 3 or fewer absences, or 90+).");  // Explains why
        } else {
            // else: runs when passes is false.
            System.out.println("\nResult: FAIL");  // Shows FAIL
            System.out.println("Reason: the student did not meet the rule (75+ with 3 or fewer absences, or 90+).");  // Explains why
        }// Ends the else here
        
        // ADVANCED
        // COMPOUND GROWTH 

        // int: a whole number. Stores the starting balance.
        int balance = 21;

        System.out.println("\n~~~ ADVANCED: Compound Growth ~~~");   // Shows the header
        System.out.println("Initial Balance: " + balance); // Shows 21

        // += adds a number to the variable and saves the new answer in it.
        // balance += 7 means the same as balance = balance + 7, so 21 + 7 = 28.
        balance += 7;
        System.out.println("After += 7: " + balance);  // Shows 28

        // *= multiplies the variable by a number and saves the new answer in it.
        // balance *= 7 means the same as balance = balance * 7, so 28 x 7 = 196.
        balance *= 7;
        System.out.println("After *= 7: " + balance);    // Shows 196

        // += again: 196 + 21 = 217.
        balance += 21;
        System.out.println("After += 21: " + balance);  // Shows 217

        // *= again: 217 x 7 = 1519.
        balance *= 7;
        System.out.println("After *= 7: " + balance); // Shows 1519

        // POSTFIX INCREMENT (count++)
        // int: a whole number. A counter that starts at 7.
        int count = 7;

        System.out.println("\n~~~ ADVANCED: Postfix Increment (count++) ~~~");       // Empty line first, then the title
        System.out.println("Starting count: " + count);              // Shows 7

        // count++ is POSTFIX: Java gives you the old value first, then adds 1 afterward.
        // So println shows 7, and only after that does count become 8.
        System.out.println("Printed count++: " + count++);           // Shows 7

        // The +1 has already happened, so count is now 8.
        System.out.println("Count right after: " + count);           // Shows 8

        // PREFIX INCREMENT (++count)

        // Put the counter back to 7 so both tests start from the same number.
        count = 7;

        System.out.println("\n~~~ ADVANCED: Prefix Increment (++count) ~~~");   // header
        System.out.println("Starting count: " + count);    // Shows 7

        // ++count is PREFIX: Java adds 1 first, then gives you the new value.
        // So count becomes 8 before println shows it, and 8 is printed.
        System.out.println("Printed ++count: " + ++count); // Shows 8

        // count is still 8, so both lines show the same number this time.
        System.out.println("Count right after: " + count);  // Shows 8

        // TWO PRINTED VALUES DIFFER: count++ printed 7 because postfix uses the old value, then adds 1 later.
        // ++count printed 8 because prefix adds 1 first, then uses the new value.
        // In both cases count ends at 8. Only the value shown inside println is different.
    
        //EXPERT
        //THE NUMBERS

        // int: a whole number. The first number.
        int x = 21;

        // int: a whole number. The second number.
        int y = 7;

        System.out.println("\n~~~ EXPERT: Precedence Puzzle Solver ~~~");  // Shows the title
        System.out.println("x = " + x + ", y = " + y);     // Shows x = 21, y = 7

        //EXPRESSION 1 (arithmetic only)
        // PREDICTED: 196 (I read it from left to right: (21 + 7) = 28, then 28 x 7 = 196).
        System.out.println("Expression 1: x + y * y = " + (x + y * y));  // Shows 70

        // FOLLOW-UP: My prediction was wrong. The actual answer is 70.
        // Rule I missed: * (multiply) is done BEFORE + (add), no matter the order.
        // So Java did y * y = 49 first, then 21 + 49 = 70.

        //EXPRESSION 2 (arithmetic + relational + logical)
        // PREDICTED: true (x - y = 14 and 14 > 7 is true; x % y = 0 and 0 == 0 is true; true && true is true).
        // Order Java uses: arithmetic (- and %) first, then relational (> and ==), then logical (&&) last.
        System.out.println("Expression 2: x - y > y && x % y == 0 = " + (x - y > y && x % y == 0));  // Shows true

        //EXPRESSION 3 (increment + arithmetic)
        // int: a whole number. A fresh counter so x and y stay unchanged.
        int k = 7;

        // PREDICTED: 16 (k++ gives the old value 7, then k becomes 8; ++k makes k 9 and gives 9; 7 + 9 = 16).
        System.out.println("Expression 3: k++ + ++k = " + (k++ + ++k));  // Shows 16

        // k went up by 1 two times (once by k++ and once by ++k), so k is now 9.
        System.out.println("k after Expression 3: " + k);  // Shows 9

        //EXPRESSION 4 (relational + logical)

        // PREDICTED: true (&& is done BEFORE ||, so (y > x && y > y) is false, then false || (x > y) which is true).
        System.out.println("Expression 4: y > x && y > y || x > y = " + (y > x && y > y || x > y));  // Shows true

        
        
    } // Ends the main method.

    } // Ends the class