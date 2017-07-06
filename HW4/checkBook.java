import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/*
 * The CheckRegister will store all checks. It stores
 * the checkNumber, payee, amount and reason. 
 * @author Celeste Kimimila

* @version 2017.06.06
 */

public class checkBook
{

    private ArrayList<Checks> checks;

         public void addCheck (Checks newCheck)
    {
         checks.add(newCheck);
        }
        
        public void printList() {
            for(Checks check : checks) {
                check.printCheck();
            }
    }
    public void writeFile(){
        Checks placeHolder = null;
        int indexOfChecks = 0;
        while(checks.size() != 0){
            String nameOfNewFile = "check.txt";
            nameOfNewFile.concat(indexOfChecks);
            PrintWriter newFile = new PrintWriter(nameOfNewFile);
            FileOutputStream outF = new FileOutputStream(nameOfFile);
            ObjectOutputStream outS = new ObjectOutputStream(outF);
            outS.writeObject(outS);
//When you don't have this, undesired bytes could be remaining in the
//buffer; thus, it's not only a good practice to flush out the
//buffer, but it's required.
            outS.flush();
            indexOfChecks++;
        }
    }

}

