import junit.framework.*;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Assertions
 *
 * Celeste Kimimila
 */
public class testCheckbook
{
    private double balance;

    /**
     * Constructor for objects of class testCheckbook
     */
    public testCheckbook()
    {
        
    }



    
    //Tests that get.Amount method is correctly passing check amount value
    @Test
    public void testAmount() {
        Check testCheck = new Check(1, 200.0, "a", "b");
        assertEquals(200.0, testCheck.getAmt(), 0.0);
    }
    
    //Tests that get.Amount is correctly passing check amount value with a negative test
    @Test
    public void testForIncorrectAmount() {
        Check testCheck = new Check(2, 400.0, "c", "d");
        assertFalse(testCheck.getAmt() != 200.0);
    }
    
    //Tests that testCheckListSize method correctly accounts for the number of check objects
    //in checkbook
    @Test
    public void testCheckListSize() {
        Checkbook testCheckbook = new Checkbook();
        Check testCheck = new Check(3, 200.0, "e", "f");
        testCheckbook.addCheck(testCheck);
        Check testCheck2 = new Check(4, 200.0, "g", "h");
        testCheckbook.addCheck(testCheck);
        assertEquals(testCheckbook.getNumberOfCheckList(), 2, 0);
        
    }
}