import java.io.Serializable;

/**
 * Homework 6
 * Writing Checks for Main
 * Celeste Kimimila
 * version 1 - working out errors. This can now open a checkbook, and add to it, as well as print the checks.
 */


public class Check implements Serializable{
    // instance variables - replace the example below with your own
    public int num;
    public double amt;
    private String why;
    private String pay;
    private final static String name = "Celeste Kimimila";
    private static final long serialVersionUID = 1L;

    /**
     * Constructor for objects of class Check
     */
    public Check(int num, double amt, String pay, String why)
    {
        // initialise instance variables
        this.num=num;
        
        this.amt=amt;
        this.pay=pay;
        this.why=why;
    }

    public void printCheck(){
        System.out.println("Celeste Kimimila           " + "00" + num);
        System.out.println("Pay to the order of _" + pay + "_________ $" + amt);
        System.out.println("For _" + why + "___________");
    }

    public void adjustWhy(String memo){
        why = memo;
    }

    public void adjustNum(int ChkNum){
        num = ChkNum;
    }

    public void adjustPay(String payee){
        pay = payee;
    }

    public double getAmt(){
        return amt;
    }

    public String getMemo(){
        return why;
    }

    public int getChkNum(){
        return num;
    }

    public String getPayee(){
        return pay;
    }

    public String getName()
    {
        return name;
    }
}
