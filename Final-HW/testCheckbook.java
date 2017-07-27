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

    /**
     * Constructor for objects of class testCheckbook
     */
    public testCheckbook()
    {
        
    }



    
    //Tests that get.Amt method is passing check amount value
    @Test
    public void testAmount() {
        Check testCheck = new Check(200.0);
        assertEquals(200.0, testCheck.getAmt(), 0.0);
    }
    
    //Tests that get.Amt is passing check amount value with a negative test
    @Test
    public void testForIncorrectAmount() {
        Check testCheck = new Check(200.0);
        assertFalse(testCheck.getAmt() != 200.0);
    }
    
    /*Tests that testCheckListSize method correctly accounts for the number of check objects
    in checkbook*/
    @Test
    public void testCheckListSize() {
        Checkbook testCheckbook = new Checkbook();
        Check testCheck = new Check(00.0);
        testCheckbook.addCheck(testCheck);
        Check testCheck2 = new Check(200.0);
        testCheckbook.addCheck(testCheck);
        assertEquals(testCheckbook.getNumberOfCheckList(), 2, 0);
        
    }
}