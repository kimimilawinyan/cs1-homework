import java.io.Serializable;

public class Checkbook implements Serializable {

    private String checkNum;
    private String Payee;
    private double amt;
    private String Reason;

    
    //Overriding toString to be able to print out the object in a readable way
    //when it is later read from the file.
    public String toString() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("Celeste Kimimila \t " + checkNum);
        buffer.append("\n");
        buffer.append("Pay to the order of:" + Payee + "\t" + amt);
        buffer.append("\n");
        buffer.append("Memo:" + Reason);
        buffer.append("\n");

        return buffer.toString();
    }


}