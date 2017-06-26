import java.util.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.nio.file.*;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

/*
 * The CheckRegister will store all checks. It stores
 * the checkNumber, payee, amount and reason. 
 * @author Celeste Kimimila
 * @version 2017.06.06
 */

public class checkBook
{
    private double balance;
    
    public class checkRegister {
    private String name;

    public checkRegister(String bookName){
        name = bookName;
        
    }
    
    private ArrayList<checkBook> register;
        private checkRegister()
        {
            register = new ArrayList<checkBook>();
    }
        public void addBook (checkBook newcheckBook)
        {
            register.add(newcheckBook);
        }
    }
    
    private ArrayList<Checks> checks;
   
  public checkBook()
    {
    checks = new ArrayList<Checks>();
    }

         public void addCheck (Checks newCheck)
    {
         checks.add(newCheck);
        }
        
        public void printList() {
            for(Checks check : checks) {
                check.printCheck();
            }
    }
}



