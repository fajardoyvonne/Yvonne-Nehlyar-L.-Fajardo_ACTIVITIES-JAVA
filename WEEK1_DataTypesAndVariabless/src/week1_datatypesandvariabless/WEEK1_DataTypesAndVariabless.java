/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1_datatypesandvariabless;

/**
 *
 * @author yvonne
 */
public class WEEK1_DataTypesAndVariabless {

// main: where the program starts running.
    public static void main(String[] args) {
       
       //BASIC
        // int: whole number. Stores your age.
        int age = 19;

        // double: number with a decimal. Stores your height in meters.
        double height = 1.60;

        // char: one single letter, in single quotes. Stores your initial.
        char initial = 'Y';

        // boolean: only true or false. Stores your student status.
        boolean isStudent = true;

        // String: text, in double quotes. Stores your full name.
        String fullName = "Yvonne Nehlyar L. Fajardo";

        // println: shows text on the screen, then moves to the next line.
        // The + joins the label with the value.
        System.out.println("~~~ BASIC: Personal Profile Printer ~~~");  // Header
        System.out.println("Full Name: " + fullName);        // Shows the name
        System.out.println("Age: " + age);                   // Shows the age
        System.out.println("Height: " + height + " meters"); // Shows the height
        System.out.println("Initial: " + initial);           // Shows the initial
        System.out.println("Student Status: " + isStudent);  // Shows true or false
        
       //INTERMEDIATE
        // String: text. Stores the name of the store.
        String storeName = "CHARMARKET";

        // int: whole number. Stores how many items you buy.
        int quantity = 21;

        // double: number with a decimal. Stores the price of one item.
        double unitPrice = 07.21;

        // totalCost: price x quantity. It is a double because the answer can have a decimal.
        // Java multiplies int x double and gives a double.
        double totalCost = quantity * unitPrice;
        // An int can only hold whole numbers, so it doesnt incude the decimal part. 
        // So if the cost is 76.50 it would become 76, and the cost would be incorrect.
        // A double keeps the decimal, so the total stays correct.
        
        // println: shows text on the screen, then moves to the next line.
        // The + joins the label with the value.
        System.out.println("\n~~~ INTERMEDIATE: Type-Safe Shopping Calculator ~~~");   // Header
        System.out.println("Store: " + storeName);            // Shows the store name
        System.out.println("Quantity: " + quantity);          // Shows how many items
        System.out.println("Unit Price: " + unitPrice);       // Shows the price of one item
        System.out.println("Total Cost: " + totalCost);       // Shows the final total
    
       //ADVANCED
        // double: number with a decimal. Stores the length in centimeters.
        double centimeters = 721.0;

        //EXPLICIT CASTING (centimeters to meters

        // 100 cm = 1 meter, so we divide by 100. The answer is 7.21 (a double).
        // (int) is an explicit cast. It forces the double into a whole number.
        // It cuts off the decimal part, so 7.21 becomes 7 whole meters.
        int meters = (int) (centimeters / 100);

        // Take away the centimeters already counted in the meters (7 x 100 = 700).
        // What is left over is the remaining centimeters: 721.0 - 700 = 21.0.
        double remainingCm = centimeters - (meters * 100);

        System.out.println("\n~~~ ADVANCED: Unit Casting Converter ~~~");  // Header
        System.out.println("Centimeters: " + centimeters); // Shows the original value
        System.out.println("Whole Meters: " + meters); // Shows the whole meters
        System.out.println("Remaining Centimeters: " + remainingCm); // Shows the leftover cm

        //IMPLICIT WIDENING (int to double)

        // int: whole number.
        int wholeNumber = 21;

        // No cast is needed, because a double is bigger than an int.
        // Java safely converts it by itself and no data is lost (21 becomes 21.0).
        double widened = wholeNumber;

        System.out.println("\n~~~ ADVANCED: Implicit Widening ~~~"); // Header
        System.out.println("int value: " + wholeNumber); // Shows 21
        System.out.println("double value: " + widened); // Shows 21.0

        //EXPLICIT NARROWING (double to int)

        // double: number with a decimal.
        double decimalNumber = 7.21;

        // A cast is needed, because an int is smaller than a double and Java wants you to confirm.
        // DATA LOST: the decimal part .21 is thrown away.
        // Java does NOT round. It just cuts off, so 7.21 becomes 7.
        int narrowed = (int) decimalNumber;

        System.out.println("\n~~~ ADVANCED: Explicit Narrowing ~~~"); // Header
        System.out.println("double value: " + decimalNumber); // Shows 7.21
        System.out.println("int value: " + narrowed); // Shows 7
        
        
       //EXPERT
         //BYTE OVERFLOW

        // byte: a small whole number. It can only hold -128 to 127.
        // 127 is the biggest value a byte can hold.
        byte smallNumber = 127;

        System.out.println("\n~~~ EXPERT: Byte Overflow ~~~"); // Header
        System.out.println("Before: " + smallNumber); // Sows 127

        // ++ adds 1. But 128 does not fit in a byte.
        // So the value wraps around (like a clock going from 12 back to 1)
        // and goes to the smallest value, -128.
        smallNumber++;

        System.out.println("After adding 1: " + smallNumber); // Shows -128

        //COMPARING STRINGS

        // new String("Java"): forces Java to build a brand new String object in memory.
        String str1 = new String("Java");

        // Another new String. Same text, but it is a different, separate object.
        String str2 = new String("Java");

        // A literal: text written directly in quotes. Java keeps it in a shared "string pool".
        String str3 = "Java";

        System.out.println("\n~~~ EXPERT: String Comparison ~~~"); // Header

        // == checks if both variables point to the same object (the same place in memory).
        // .equals() checks if the TEXT inside is the same.

        // str1 and str2: == is false, because each "new String" made its own separate object.
        System.out.println("str1 == str2: " + (str1 == str2));           // Shows false
        // .equals() is true, because both objects hold the text "Java".
        System.out.println("str1.equals(str2): " + str1.equals(str2));   // Shows true

        // str1 and str3:
        // == is false, because str1 is a new object, and str3 is in the string pool.
        System.out.println("str1 == str3: " + (str1 == str3));           // Shows false
        // .equals() is true, because the text is the same.
        System.out.println("str1.equals(str3): " + str1.equals(str3));   // Shows true

        // str2 and str3: == is false, for the same reason: str2 is a new object, and str3 is in the pool.
        System.out.println("str2 == str3: " + (str2 == str3));           // Shows false
        // .equals() is true, because the text is the same.
        System.out.println("str2.equals(str3): " + str2.equals(str3));   // Shows true

        //SHARED ARRAY REFERENCE 
        // int[]: an array, a list of whole numbers. This one holds 1, 2, and 3.
        int[] original = {1, 2, 3};

        // This does NOT copy the array. It makes "shared" point to the SAME array.
        // Think of two names for one box.
        int[] shared = original;

        // Change the first item (position 0) using the name "shared".
        shared[0] = 99;

        System.out.println("\n~~~ EXPERT: Shared Array ~~~");           // Header
        System.out.println("shared[0]: " + shared[0]);             // Shows 99
        // Because both names point to the same array, the change shows up here too.
        System.out.println("original[0]: " + original[0]);         // Shows 99
        // == is true, because both variables point to the same array.
        System.out.println("original == shared: " + (original == shared)); // Shows true
        
        
    } // Ends the main method.
} // Ends the class.
        