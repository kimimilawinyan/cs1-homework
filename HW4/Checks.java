import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Check details
 *
 * @author Celeste Kimimila 
 * @version .01
 */
public class Checks implements java.io.Serializable {

    static public int num;

    static public double amt;

    static public String pay;

    static public String why;
    
    private final static String name = "Celeste Kimimila";

    /**
     * Constructor for objects of class Check
     */
    public Checks(int checkNumber, double amount, String payee, String reason) {
   
       this.num = checkNumber;
       this.amt = amount;
       this.pay = payee;
       this.why = reason;
    }
    
        public int getcheckNumber()
    {
        return num;
    }
       public double getamount()
    {
        return amt;
    }
       public String getpayee()
    {
        return pay;
    }
       public String getreason()
    {
        return why;
    }
 
    public void printCheck()
    {
        System.out.println("Celeste Kimimila                            " + "00"+num);
        System.out.println("Pay to the Order of: " + pay + "      $" + amt);
        System.out.println("Memo: " + why);
        

    }
          public static void writeFile3() throws IOException {
	PrintWriter pw = new PrintWriter(new FileWriter("checkreg.txt"));
 
	for (int i = 0; i < 1; i++) {
		pw.write("Celeste Kimimila                            " + "00"+ Checks.num);
		pw.write("Pay to the Order of: " + Checks.pay + "      $" + Checks.amt);
		pw.write("Memo: " + Checks.why);
		
	}
 
	pw.close();
}
    

}

