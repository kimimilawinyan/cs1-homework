import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;
import java.util.*;

//import java.lang.*
/**
 * Homework 6
 * Using the Main class for a menu, and user interaction.
 * Celeste Kimimila
 * version 1 - working out errors. This can now open a checkbook, and add to it, as well as print the checks.
 */
public class Main
{


    static Scanner input = new Scanner(System.in);
    static Check[] checkList = new Check[10];
    static ObjectInputStream in;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static int counter = 0;
    static String menuDisplay;
    static double checkAmt; //user input string form
    static double cvtAmount; //converted amount
    static int cvtCheckNum;
    static String checkWhy;
    static Checkbook cktCheckBook;



    private static void askUser(){
        System.out.println("Press 1 to create a new checkbook");
        System.out.println("Press 2 to access an existing checkbook");
        System.out.println("Press 3 to write a check");
        System.out.println("Press 4 to print checks");
        System.out.println("Press 5 to quit");
    }

    private static String getValue(String s) {
        String r;
        System.out.println(s);
        try {
            r = reader.readLine();
            return r;
        } catch (Exception e) {
            System.out.println("getValue failed " + e.toString());
        }
        return ("Error");
    }

    private static void printCheck(Check theCheck) {
        System.out.println("Here is your new check.");
        System.out.println("Celeste Kimimila" + "                     " + "00" + theCheck.getChkNum());
        System.out.println("Pay to the order of: " + theCheck.getPayee() + "   $" + theCheck.getAmt());
        System.out.println("For: " + theCheck.getMemo());
    }

    public static void main(String [] args) {
        String checkAmt;
        String checkNum;
        String checkPay;
        String checkWhy;
        try{
//menu layout - user interaction is here
            askUser();
            while (input.hasNext()) {
                menuDisplay = input.nextLine();
                switch (menuDisplay) {
                    
                    case "1":
//creates new checkbook object
                        cktCheckBook = new Checkbook();
                        System.out.println("");
                        System.out.println("Here is your new checkbook: " + cktCheckBook);
                        break;

                    case "2":
//this should open an existing checkbook object
                        cktCheckBook.depersist();
                        break;

                    case "3":
//new check>added to checkbook> appended to a serialized file
                        if(cktCheckBook == null){
                            System.out.println("Please create checkbook");
                            break;
                        } else {
                            reader = new BufferedReader(new InputStreamReader(System.in));

                            checkAmt = getValue("Please enter amount.");
                            checkNum = getValue("Please enter checkNumber.");
                            checkPay = getValue("Please enter payee.");
                            checkWhy = getValue("Please enter memo.");

                            //converts string values for amount and checkNumber to double value
                           cvtAmount = Double.parseDouble(checkAmt); //conversion
                           cvtCheckNum = Integer.parseInt(checkNum);

                            Check newCheck = new Check(cvtCheckNum, cvtAmount, checkPay, checkWhy);
                            printCheck(newCheck);
                            cktCheckBook.addCheck(newCheck);
                            cktCheckBook.appendToFile(newCheck);
                        }
                        break;
// added to print the checklist by using the method we created in Checkbook.java - ckt
                    case "4":
                        if(cktCheckBook == null){
                            System.out.println("Please create checkbook");
                        } else {
                            cktCheckBook.printList();

                        }
                        break;

                    case "5":
//quits the program and saves checkbook to a serialized file
                        if(cktCheckBook == null){
                            System.out.println("Please create checkbook");
                            break;
                        } else {
                            cktCheckBook.saveOverFile();
                            System.out.println("Your checkbook is saved in checkreg.txt");
                            System.out.println("Done!");
                            input.close();
//added the System exit to stop the err on case 5, previously case 4
                            System.exit(0);
                        }
                        break;
                    default: break;
                }
            }
        } catch (Exception e){
            System.out.println(" Died at the beginning " + e.toString());
        }
    }
}
