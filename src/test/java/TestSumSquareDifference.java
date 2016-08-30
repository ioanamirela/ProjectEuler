import math.SumSquareDifference;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ioana on 30/08/2016.
 */
public class TestSumSquareDifference {


    @Test
    public void testSumSquareDifference(){
        SumSquareDifference ssd = new SumSquareDifference();

        Assert.assertTrue(ssd.squareOfSums(10) - ssd.sumOfSquares(10) == 2640);

        Assert.assertTrue(ssd.squareOfSums(100) - ssd.sumOfSquares(100) == 25164150);
    }
}
