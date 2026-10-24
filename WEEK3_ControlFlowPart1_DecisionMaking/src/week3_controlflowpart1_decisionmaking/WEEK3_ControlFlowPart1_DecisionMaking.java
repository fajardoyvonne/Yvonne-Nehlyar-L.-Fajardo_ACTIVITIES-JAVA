/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week3_controlflowpart1_decisionmaking;

/**
 *
 * @author yvonne
 */
public class WEEK3_ControlFlowPart1_DecisionMaking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //BASIC
        //THE SCORES
        // int: a whole number. Stores the first test score.
        int score1 = 21;

        // int: a whole number. Stores the second test score (21 x 7 = 147).
        int score2 = 21 * 7;

        System.out.println("~~~ BASIC: Simple Grade Classifier ~~~");  // Shows the header

        // TEST 1: score1 (21) failed

        System.out.println("Score: " + score1);   // Shows the score being tested (21)

        // if-else: runs ONE of two choices.
        // >= means "greater than or equal to", so 60 itself also passes.
        if (score1 >= 60) {
            System.out.println("PASSED");         // Runs only when score1 is 60 or above
        } else {
            System.out.println("FAILED");         // Runs when score1 is below 60 (this one runs, since 21 < 60)
        }

        // TEST 2: score2 (147) passed

        System.out.println("Score: " + score2);   // Shows the score being tested (147)

        // The same if-else again, this time checking score2.
        if (score2 >= 60) {
            System.out.println("PASSED");         // Runs only when score2 is 60 or above (this one runs, since 147 >= 60)
        } else {
            System.out.println("FAILED");         // Runs when score2 is below 60
        }
        
      //INTERMEDIATE
      // THE PURCHASE
        // double: a number with a decimal. Stores the purchase amount.
        double purchaseAmount = 21;

        // These two variables are empty for now. The else-if ladder will fill them in.
        int discountPercent;       // Stores the discount percentage
        String discountTier;       // Stores the name of the tier

        // THE ELSE IF LADDER

        // Java checks the conditions from the top and stops at the first one that is true.
        // The ranges go from the biggest amount to the smallest, so no tier is unreachable.
        // If >= 21 came first, even a big amount like 200 would stop there, and the higher tiers would never run.
        if (purchaseAmount >= 147) {          // Branch 1: 147 or more (21 x 7)
            discountPercent = 15;             // Biggest discount
            discountTier = "Tier 4";
        } else if (purchaseAmount >= 28) {    // Branch 2: 28 up to 146.99 (28 = 21 + 7)
            discountPercent = 10;
            discountTier = "Tier 3";
        } else if (purchaseAmount >= 21) {    // Branch 3: 21 up to 27.99. >= includes 21 itself, so this one runs
            discountPercent = 5;
            discountTier = "Tier 2";
        } else {                              // Branch 4: anything below 21
            discountPercent = 0;              // No discount
            discountTier = "Tier 1";
        }

        // THE FINAL PRICE

        // Final price = amount x (100 - discount) / 100.
        // Example: 21 x (100 - 5) / 100 = 21 x 95 / 100 = 19.95.
        double finalPrice = purchaseAmount * (100 - discountPercent) / 100;

        System.out.println("\n~~~ INTERMEDIATE: Multi-Tier Discount System ~~~");    // Shows the header
        System.out.println("Purchase Amount: " + purchaseAmount);     // Shows 21.0
        System.out.println("Discount Tier: " + discountTier + " (" + discountPercent + "% off)");   // Shows the tier and discount
        System.out.println("Final Price: " + finalPrice);   // Shows 19.95 
        
        //ADVANCED
         //THE CORRECT LOGIN DETAILS

        // String: text. The real username saved in the system.
        String correctUsername = "user21";

        // String: text. The real password saved in the system.
        String correctPassword = "pass7";

        // These three variables hold what the person typed. We change them for each test.
        String typedUsername;     // The username typed in
        String typedPassword;     // The password typed in
        boolean isLocked;         // boolean: true or false. Is the account locked?

        System.out.println("\n~~~ ADVANCED: Nested Login Validator ~~~");  // Shows the header

        // TEST 1: EVERYTHING CORRECT

        System.out.println("Test 1 (all correct):");   // Shows which test is running
        typedUsername = "user21";                      // Correct username
        typedPassword = "pass7";                       // Correct password
        isLocked = false;                              // The account is not locked

        // STAGE 1: check the username first. .equals() compares the text inside two Strings.
        if (typedUsername.equals(correctUsername)) {

            // STAGE 2 (nested if): this runs only if the username matched.
            if (typedPassword.equals(correctPassword)) {

                // STAGE 3 (even deeper nested if): this runs ONLY if the username and password matched.
                // ! means not, so !isLocked is true when the account is not locked.
                if (!isLocked) {
                    System.out.println("Login successful. Welcome!");            // All 3 stages passed
                } else {
                    System.out.println("Login failed: the account is locked.");  // Stage 3 failed
                }
            } else {
                System.out.println("Login failed: wrong password.");             // Stage 2 failed
            }
        } else {
            System.out.println("Login failed: username not found.");             // Stage 1 failed
        }

        //TEST 2: WRONG USERNAME (STAGE 1 FAILS)

        System.out.println("\nTest 2 (wrong username):");  // test name
        typedUsername = "user7";                           // wrong username
        typedPassword = "pass7";                           // Correct password (but it is never checked)
        isLocked = false;                                  // The account is not locked

        // The same nested if again, to test the new values.
        if (typedUsername.equals(correctUsername)) {                                 // Stage 1: fails here
            if (typedPassword.equals(correctPassword)) {                             // Stage 2: skipped
                if (!isLocked) {                                                     // Stage 3: skipped
                    System.out.println("Login successful. Welcome!");
                } else {
                    System.out.println("Login failed: the account is locked.");
                }
            } else {
                System.out.println("Login failed: wrong password.");
            }
        } else {
            System.out.println("Login failed: username not found.");                 // This one runs
        }

        //TEST 3: WRONG PASSWORD (STAGE 2 FAILS)

        System.out.println("\nTest 3 (wrong password):");  // test name
        typedUsername = "user21";                          // Correct username
        typedPassword = "pass21";                          // WRONG password
        isLocked = false;                                  // The account is not locked

        // The same nested if again, to test the new values.
        if (typedUsername.equals(correctUsername)) {                                 // Stage 1: passes
            if (typedPassword.equals(correctPassword)) {                             // Stage 2: fails here
                if (!isLocked) {                                                     // Stage 3: skipped
                    System.out.println("Login successful. Welcome!");
                } else {
                    System.out.println("Login failed: the account is locked.");
                }
            } else {
                System.out.println("Login failed: wrong password.");                 // This one runs
            }
        } else {
            System.out.println("Login failed: username not found.");
        }

        //TEST 4: ACCOUNT LOCKED (STAGE 3 FAILS)

        System.out.println("\nTest 4 (account locked):");  // test name
        typedUsername = "user21";                          // Correct username
        typedPassword = "pass7";                           // Correct password
        isLocked = true;                                   // The account IS locked

        // The same nested if again, to test the new values.
        if (typedUsername.equals(correctUsername)) {                                 // Stage 1: passes
            if (typedPassword.equals(correctPassword)) {                             // Stage 2: passes
                if (!isLocked) {                                                     // Stage 3: fails here
                    System.out.println("Login successful. Welcome!");
                } else {
                    System.out.println("Login failed: the account is locked.");      // This one runs
                }
            } else {
                System.out.println("Login failed: wrong password.");
            }
        } else {
            System.out.println("Login failed: username not found.");
        }
        
        
        //EXPERT
        //THE BANK DETAILS
        // The details saved in the bank.
        String storedUsername = "user21";   // String: text. The real username
        int storedPin = 2107;               // int: a whole number. The real 4-digit PIN

        // The details in at the ATM. Change these to test a wrong username or PIN.
        String enteredUsername = "user21";  // The username
        int enteredPin = 2107;              // The PIN

        // double: numbers with decimals. The account balance and the amount to withdraw.
        double balance = 7000;              // Money in the account
        double withdrawal = 2100;           // Money the person wants to take out

        System.out.println("\n~~~ EXPERT: ATM Transaction Authorizer ~~~");  // Shows the header

        //CHECK THE USERNAME AND PIN (NESTED IF) 
        // NESTED IF 1: check the username first. .equals() compares the text inside two Strings.
        if (enteredUsername.equals(storedUsername)) {

            // NESTED IF 2: check the PIN only if the username matched. == compares numbers.
            if (enteredPin == storedPin) {

                // Everything inside here runs only if the username and the PIN are both correct.

                //FIND THE TIER (ELSE-IF LADDER) 
                String tier;           // Will hold Bronze, Silver, Gold, or Platinum
                double dailyLimit;     // The most this tier can withdraw in one day

                // Java checks from the top and stops at the FIRST true condition.
                // The biggest balance is checked first, so no tier is unreachable.
                if (balance >= 21000) {           // 21000 or more
                    tier = "Platinum";
                    dailyLimit = 21000;
                } else if (balance >= 7000) {     // 7000 up to 20999.99. 7000 is on the line, so this one runs
                    tier = "Gold";
                    dailyLimit = 7000;
                } else if (balance >= 2100) {     // 2100 up to 6999.99
                    tier = "Silver";
                    dailyLimit = 2100;
                } else {                          // Below 2100
                    tier = "Bronze";
                    dailyLimit = 700;
                }

                //FIND THE FEE (SWITCH) 
                double feePercent;     // The fee percentage for this tier

                // switch: jumps to the "case" that matches the tier's name.
                // break: stops Java from running into the next case.
                switch (tier) {
                    case "Platinum":
                        feePercent = 0.21;   // Best tier, smallest fee
                        break;
                    case "Gold":
                        feePercent = 0.7;    // This one runs for Gold
                        break;
                    case "Silver":
                        feePercent = 2.1;
                        break;
                    default:                 // default: runs when no case matched (Bronze)
                        feePercent = 7;      // Lowest tier, biggest fee
                        break;
                }

                // Fee = withdrawal x fee percentage / 100. Total charged = withdrawal + fee.
                double fee = withdrawal * feePercent / 100;
                double totalCharge = withdrawal + fee;

                //THE WITHDRAWAL CHECKS (NESTED IF) 

                boolean approved = false;     // Starts as false. It becomes true only if every check passes.
                String denialReason = "";     // Stores the exact reason if the withdrawal is denied.

                // First check: is there enough balance to cover the withdrawal AND the fee?
                if (totalCharge <= balance) {

                    // Inside the first check: now check the tier's daily limit.
                    if (withdrawal <= dailyLimit) {
                        approved = true;      // Enough balance AND within the daily limit
                    } else {
                        denialReason = "the withdrawal is above the daily limit for the " + tier + " tier.";
                    }
                } else {
                    denialReason = "the balance is not enough to cover the withdrawal and the fee.";
                }

                System.out.println("Account Tier: " + tier);                  // Shows Gold
                System.out.println("Daily Limit: " + dailyLimit);             // Shows 7000.0
                System.out.println("Fee Percentage: " + feePercent + "%");    // Shows 0.7%
                System.out.println("Withdrawal: " + withdrawal);              // Shows 2100.0
                System.out.println("Fee: " + fee);                            // Shows 14.7

                //APPROVE OR DENY (IF-ELSE) 

                if (approved) {
                    System.out.println("Result: APPROVED");                           // Shows APPROVED
                    System.out.println("New Balance: " + (balance - totalCharge));    // Balance minus withdrawal and fee
                } else {
                    System.out.println("Result: DENIED");                             // Shows DENIED
                    System.out.println("Reason: " + denialReason);                    // Shows the exact reason
                }
            } else {
                System.out.println("Result: DENIED");                                 // The PIN did not match
                System.out.println("Reason: the PIN is wrong.");
            }
        } else {
            System.out.println("Result: DENIED");                                     // The username did not match
            System.out.println("Reason: the username is not found.");
        }



        
    } // Ends the main method.
} // Ends the class.