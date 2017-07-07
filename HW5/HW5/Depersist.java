import java.io.*;

class Depersist{
public static void main(String args[])throws Exception{
ObjectInputStream in = 
new ObjectInputStream(new FileInputStream("checkreg.txt"));
// get the next object and cast to the Student class
Checks c =(Checks)in.readObject();  
System.out.println("Celeste Kimimila                            " + "00"+ c.num);
System.out.println("Pay to the Order of: " + c.pay + "      $" + c.amt);
System.out.println("Memo: " + c.why);
in.close();
}
}