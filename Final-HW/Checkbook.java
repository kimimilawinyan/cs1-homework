import java.util.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.nio.file.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 * Homework 6
 * Holding Checks for Main
 * Celeste Kimimila
 * version 1 - working out errors. This can now open a checkbook, and add to it, as well as print the checks.
 */
public class Checkbook
{
    public ArrayList<Check> checkList;
    private int numberofChecks;
    private ObjectOutputStream os;
    private final String FILE_NAME = "checkreg.txt";

    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {

        checkList = new ArrayList<Check>();
        Path destination = Paths.get(FILE_NAME);
        try{
            os = new ObjectOutputStream(
                                    new FileOutputStream(
                                        destination.toString(), true));
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    //public void setName (String name)

    public void addCheck(Check newCheck){
         ++numberofChecks;
        checkList.add(newCheck);
    }

    public int getNumberOfCheckList()
    {
        return checkList.size();
    }

    /**
     * User saves check objects one by one to a text file in their serialized format.
     */
    public void appendToFile(Check checkName)
    {
        try{
            os.writeObject(checkName);
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }

    /**
     * Once the user has appended all checks to the text file, the user must saveOverFile to close
     * the output stream and save all entries to the file.
     */
    public void saveOverFile(){
        try{
             os.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void printList(){
        for(Check check : checkList) {
           check.printCheck();
        }
    }

    public void depersist(){
        int counter = 0;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("checkreg.txt"));
            System.out.println("Your checkbook is now open! ");
            Check tempCheck = null;
            while((tempCheck = (Check)in.readObject()) != null){          
            checkList.add(tempCheck);  
            checkList.get(counter).printCheck();
            counter++;  
        }
            in.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
}
}
