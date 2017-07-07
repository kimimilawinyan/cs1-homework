import java.io.*;

public class Persist{
public static void main(String args[]){
Checks c1 = new Checks(2, 24.56, "Bob", "rent");
try {
FileOutputStream f = new FileOutputStream("checkreg.txt", true);
ObjectOutputStream out = new ObjectOutputStream(f);
out.writeObject(c1); // here's where we serialize
out.flush();
// force the buffer to be flushed
}
catch (IOException e ) {
e.printStackTrace();
System.out.println("Unable to serialize the object");
}
}
}