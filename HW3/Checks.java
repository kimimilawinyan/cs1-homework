
/**
 * Check details
 *
 * @author Celeste Kimimila 
 * @version .01
 */
public class Checks
implements java.io.Serializable
{

    public int num;

    public double amt;

    private String pay;

    private String why;
    
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
}

