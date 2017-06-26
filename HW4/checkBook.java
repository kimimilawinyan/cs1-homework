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
  public static void writeFile3() throws IOException {
	PrintWriter pw = new PrintWriter(new FileWriter("checkreg.txt"));
 
	for (int i = 0; i < 10; i++) {
		pw.write("Celeste Kimimila                            " + "00"+ Checks.num);
		pw.write("Pay to the Order of: " + Checks.pay + "      $" + Checks.amt);
		pw.write("Memo: " + Checks.why);
		
	}
 
	pw.close();
}

}