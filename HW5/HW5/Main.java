import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.nio.file.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 * Homework 5
 * Using the Main class for a menu, and user interaction.
 * Celeste Kimimila
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
    static ObjectOutputStream os;

    private static void askUser(){
        System.out.println("Press 1 to create a new checkbook");
        System.out.println("Press 2 to access an existing checkbook");
        System.out.println("Press 3 to write a check");
        System.out.println("Press 4 to quit");
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
        System.out.println("Celeste Kimimila" + "                       " + theCheck.getChkNum());
        System.out.println("Pay to the order of: " + theCheck.getPayee() + " $" + theCheck.getAmt());
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
//access the checkbook object
                        try{
                            
                            FileInputStream inputFileStream = new FileInputStream("checkreg.txt");
                            ObjectInputStream objectInputStream = new ObjectInputStream(inputFileStream);
                            
                            while ((checkList[counter] = (Check)in.readObject()) != null){
                                
                                System.out.println("Here is your checkbook: ");
                                System.out.println(checkList[counter]);
                                counter = counter + 1;
                                objectInputStream.close();
                                inputFileStream.close();
                                os.flush();
                            }
                        } catch(Exception e){
                            System.out.println("Option 2 " + e.toString());
                        }
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

                    case "4":
                        //quits the program and saves checkbook to a serialized file
                        if(cktCheckBook == null){
                            System.out.println("Please create checkbook");
                            break;
                        } else {
                            cktCheckBook.saveOverFile();
                            System.out.println("Your checkbook is saved in checkreg.txt");
                            System.out.println("Done!");
                            input.close();
                            // this exit helped stop the exception error on close.
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
