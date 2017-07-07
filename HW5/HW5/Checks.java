import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.Serializable;
/**
 * Check details
 *
 * @author Celeste Kimimila
 * @version .01
 */
public class Checks implements Serializable {
    
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
}

