/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week5_arrays;

/**
 *
 * @author yvonne
 */
// Imports Arrays so we can use Arrays.toString() to print an int[] nicely (we do not use Arrays.sort()).
import java.util.Arrays;
public class WEEK5_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //BASIC
        //THE ARRAY
        // String[]: an array is a list that holds many values of the same type, in one variable.
        // The values go inside { } and are separated by commas.
        String[] favorites = {"Cheese", "Crafts/DIY", "Charm", "Art", "Warmth"};

        System.out.println("~ BASIC: Favorite Things Array ~~~");  // Shows the header

        //PRINT EACH ITEM, NUMBERED 1 TO 5
        // for loop: repeats the code inside once for each item in the array.
        // int i = 0   (start at position 0, because arrays start counting from 0.)
        // i < favorites.length  (keep going while i is smaller than the array's length (5).)
        // i++ (add 1 to i after each round.)
        for (int i = 0; i < favorites.length; i++) {

            // favorites[i] is the item at position i.
            // (i + 1) is the number shown to the person. Positions start at 0, but a list should start at 1.
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        //PRINT THE ARRAY'S LENGTH
        // .length: gives how many items the array holds. There are no brackets () after it.
        System.out.println("Total number of favorites: " + favorites.length);   // Shows the 5 favorites
        
        //INTERMEDIATE
         //THE SCORES
        // int[]: an array of whole numbers. This one holds 8 student scores.
        int[] scores = {21, 7, 42, 14, 28, 35, 49, 21};

        System.out.println("\n~~~ INTERMEDIATE: Class Statistics Calculator ~~~");  // Shows the header

        //SHOW THE SCORES
        System.out.print("Scores: ");  // print (not println) stays on the same line
        for (int index = 0; index < scores.length; index++) {
            System.out.print(scores[index] + " ");  // Prints each score
        }
        System.out.println();  // Moves to the next line
        System.out.println("Number of scores: " + scores.length);   // Shows 8

        //THE STARTING VALUES
        // int: the running sum starts at 0, because nothing has been added yet.
        int sum = 0;

        // The highest and the lowest both start as the first score.
        // Then each other score is compared to them. (Starting at 0 would break the lowest score.)
        int highest = scores[0];
        int lowest = scores[0];

        //THE LOOP (NO BUILT-IN SHORTCUTS)
        // One for loop visits every score once, and updates all three values.
        for (int index = 0; index < scores.length; index++) {

            // += adds this score to the running number.
            sum += scores[index];

            // If this score is bigger than the highest so far, it becomes the new highest.
            if (scores[index] > highest) {
                highest = scores[index];
            }

            // If this score is smaller than the lowest so far, it becomes the new lowest.
            if (scores[index] < lowest) {
                lowest = scores[index];
            }
        }

        //THE AVERAGE
        // (double) is a cast. It turns number into a decimal number before dividing.
        // Without it, Java would divide two whole numbers (217 / 8 and drop the decimal, giving 27.
        double average = (double) sum / scores.length;

        //PRINT THE FOUR STATISTICS
        System.out.println("Sum: " + sum);                     // Shows the total of all scores
        System.out.println("Average: " + average);             // Shows the sum divided by how many scores
        System.out.println("Highest score: " + highest);       // Shows the biggest score
        System.out.println("Lowest score: " + lowest);         // Shows the smallest score

       //ADVANCED
        System.out.println("\n~~~ ADVANCED: Search & Sort Mini-Tool ~~~");   // Shows the header

        //THE LINEAR SEARCH (on the original scores array)
        // int: the number we are looking for.
        int target = 21;

        // int: will store the position (index) where the target is found.
        // -1 means "not found yet", because no real position can be -1.
        int foundIndex = -1;

        // Arrays.toString: turns the whole array into one line of text, like [21, 7, 42].
        System.out.println("Original scores: " + Arrays.toString(scores));   // Shows the scores in their first order
        System.out.println("Searching for: " + target);                      // Shows the number we are looking for

        // Linear search means checking the items one by one, from the first to the last.
        // position is the index. It starts at 0 (the first item) and goes up by 1 each round.
        for (int position = 0; position < scores.length; position++) {

            // checking if the item at this position equal to the target. If yes, we found it.
            if (scores[position] == target) {
                foundIndex = position;    // Save the position where we found it
                break;                    // Stop searching. This keeps the first match (21 is also at index 7, but we stop at index 0).
            }
        }

        // If foundIndex is not -1, the search found the target. Otherwise, it was not in the array.
        if (foundIndex != -1) {
            System.out.println("Found " + target + " at index " + foundIndex + " (position " + (foundIndex + 1) + " in the list)");
        } else {
            System.out.println(target + " was NOT found in the array.");
        }

        //SORT A COPY OF THE ARRAY
        //first, make a copy. Arrays.copyOf creates a second array with the same numbers.
        // Now there are two arrays: scores (the original) and sortedScores (the copy).
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        //second, sort only the copy. Arrays.sort puts the numbers in order, from smallest to biggest.
        // The original array is not touched, so it stays in its first order.
        Arrays.sort(sortedScores);

        // sorting the copy instead of the original because sorting changes the order of the numbers, and the old order would be lost forever.
        //  need the original order because the search result ("index 0") belongs to that order.
        //  also need both lists, so we can print the original and the sorted one and compare them.
        // So  sort the copy and keep the original safe.

        //PRINT BOTH VERSIONS
        System.out.println("Sorted copy: " + Arrays.toString(sortedScores));              // Shows the copy, in order
        System.out.println("Original scores (unchanged): " + Arrays.toString(scores));    // Shows the original, still in its first order

        
        //EXPERT
        //THE RAW DATA (2D ARRAY)
        // String[]: the names of 5 students.
        String[] names = {"Charm", "Charmie", "Charmaine", "Maimai", "Maine"};

        // 2D array: a table of numbers. Each row is one student. Each column is one quiz (4 quizzes each).
        // Row 0 is Charm's quizzes, row 1 is Ben's, and so on, in the same order as the names above.
        int[][] rawQuizzes = {
            {84, 70, 91, 77},     // Charm
            {63, 77, 70, 98},     // Charmie
            {91, 84, 77, 70},     // Charmaine  (same average as charm, so these two will TIE)
            {49, 56, 63, 42},     // Maimai
            {98, 91, 84, 98}      // Maine
        };

        //BUILD THE ARRAY OF STUDENT OBJECTS
        // Student[]: an array that holds Student objects (the Student class is at the bottom of this file).
        // new Student[5] makes 5 empty slots. The loop below fills each slot.
        Student[] students = new Student[names.length];

        for (int i = 0; i < names.length; i++) {
            // new Student(...) builds one Student from a name and one row of quiz scores.
            students[i] = new Student(names[i], rawQuizzes[i]);
        }

        //MY OWN SORT ALGORITHM (bubble sort, no Arrays.sort())
        // Bubble sort: compare two neighbors, and swap them if they are in the wrong order.
        // Repeat many times, and the highest averages "bubble" up to the front.
        for (int pass = 0; pass < students.length - 1; pass++) {

            // Each pass checks the neighbors. After each pass, the last checked spot is already correct, so check one less.
            for (int c = 0; c < students.length - 1 - pass; c++) {

                // the highest average first. If the left student has a lower average than the right one, swap them.
                //  use < (not <=), so students with the same average are never swapped and keep their order (this handles ties fairly).
                if (students[c].average < students[c + 1].average) {

                    Student temp = students[c];          // Keep the left student safe in a temporary spot
                    students[c] = students[c + 1];       // Move the right student to the left
                    students[c + 1] = temp;              // Put the saved student on the right
                }
            }
        }

        //GIVE EACH STUDENT A RANK (HANDLES TIES)
        // The first student (highest average) is rank 1.
        students[0].rank = 1;

        for (int i = 1; i < students.length; i++) {

            if (students[i].average == students[i - 1].average) {
                // TIE: same average as the student before, so they share the same rank.
                students[i].rank = students[i - 1].rank;
            } else {
                // No tie: the rank is the position + 1. This skips a rank after a tie (1, 2, 2, 4).
                students[i].rank = i + 1;
            }
        }

        //PRINT THE LEADERBOARD
        System.out.println("\n~~~ EXPERT: Class Ranking System ~~~");   // Shows the header
        System.out.println("Ranked by average, highest first. Students with the same average share a rank.");

        // printf: prints with formatting. %-6s means "text, left-aligned, 6 spaces wide".
        // %n means "new line".
        System.out.printf("%-6s %-6s %-20s %-8s %s%n", "Rank", "Name", "Quizzes", "Average", "Note");

        for (int i = 0; i < students.length; i++) {

            // A student is tied if the one before or the one after has the same rank.
            boolean tied = (i > 0 && students[i].rank == students[i - 1].rank)
                        || (i < students.length - 1 && students[i].rank == students[i + 1].rank);

            String note = "";             // Empty text, unless there is a tie
            if (tied) {
                note = "TIE";
            }

            // %-6d = whole number, 6 wide. %-8.2f = decimal number with 2 digits after the point, 8 wide.
            System.out.printf("%-6d %-6s %-20s %-8.2f %s%n",
                    students[i].rank, students[i].name, Arrays.toString(students[i].quizzes), students[i].average, note);
        }

        //MY OWN LINEAR SEARCH (RETURNS A STUDENT'S RANK)
        System.out.println("\nSearch results:");

        int rankOfCharmaine = findRank(students, "Charmaine");    // Search for a student who exists
        if (rankOfCharmaine != -1) {
            System.out.println("Rank of Charmaine: " + rankOfCharmaine);
        } else {
            System.out.println("Charmaine was not found.");
        }

        int rankOfTotoro = findRank(students, "Totoro");      // Search for a student who does not exist
        if (rankOfTotoro!= -1) {
            System.out.println("Rank of Totoro: " + rankOfTotoro);
        } else {
            System.out.println("Totoro was not found.");
        }

    } // Ends the main method.

    //MY OWN LINEAR SEARCH METHOD
    // It checks the students one by one, and returns the rank of the student with the matching name.
    // It returns -1 if nobody has that name.
    public static int findRank(Student[] ranked, String searchName) {

        for (int i = 0; i < ranked.length; i++) {

            // .equals compares the text of two names.
            if (ranked[i].name.equals(searchName)) {
                return ranked[i].rank;    // Found: send this student's rank back right away
            }
        }

        return -1;    // The loop finished and nobody matched, so "not found"
    }

} // Ends the class WEEK5_Arrays.

//THE STUDENT CLASS
// A class is a blueprint for making objects. Each Student object holds the details of one student.
// It sits below the main class, in the same file. (Only one class per file can be "public".)
class Student {

    String name;        // The student's name
    int[] quizzes;      // The student's quiz scores (an array inside the object)
    double average;     // The average of the quizzes
    int rank;           // The student's rank (filled in later, after sorting)

    // Constructor: the setup steps that run when a new Student is created.
    // "this.name" means the name that belongs to this student. The plain "name" is the value that was passed in.
    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;

        // Add up the quizzes with a loop, then divide to get the average.
        int total = 0;
        for (int i = 0; i < quizzes.length; i++) {
            total += quizzes[i];
        }
        this.average = (double) total / quizzes.length;
    
    } // Ends the main method.
} // Ends the class
 