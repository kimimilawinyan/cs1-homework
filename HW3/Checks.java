
/**
 * Check details
 *
 * @author Celeste Kimimila 
 * @version .01
 */
public class Checks
{

    private String num;

    private double amt;

    private String pay;

    private String why;

    /**
     * Constructor for objects of class Check
     */
public Checks(String checkNumber, double amount, String payee, String reason){
   
       num = checkNumber;
       amt = amount;
       pay = payee;
       why = reason;
    }
    
        public String getcheckNumber()
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
        System.out.println("Celeste Kimimila                            " + num);
        System.out.println("Pay to the Order of: " + pay + "      $" + amt);
        System.out.println("Memo: " + why);

    }
}

