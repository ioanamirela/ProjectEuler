import messages.EulerMessage;
import math.LargestPalindromeProduct;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Ioana on 21/05/2016.
 */
public class TestLargestPalindrome {

    @Test
    public void testLargestPalindrome(){
        LargestPalindromeProduct p = new LargestPalindromeProduct();

        try{
            // 9009 = 91 * 99
            Assert.assertTrue(p.computeLargestPalindrome(2) == 9009);

            // 906609 = 993 * 913
            Assert.assertTrue(p.computeLargestPalindrome(3) == 906609);
        }catch(EulerMessage e){
            e.printMessage();
        }
    }
}
