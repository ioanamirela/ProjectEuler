import messages.EulerMessage;
import math.SmallestMultiple;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ioana on 30/08/2016.
 */
public class TestSmallestMultiple {

    @Test
    public void testLargestPalindrome(){
        SmallestMultiple sm = new SmallestMultiple();

        try{

            //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
            Assert.assertTrue(sm.smallestPositive(10) == 2520);

            //232792560 is the smallest number that can be divided by each of the numbers from 1 to 20 without any remainder.
            Assert.assertTrue(sm.smallestPositive(20) == 232792560);

        }catch(EulerMessage e){
            e.printMessage();
        }
    }
}