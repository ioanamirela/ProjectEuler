package math;

import messages.EulerMessage;

/**
 * Created by Ioana on 29/08/2016.
 *
 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

    /**
     * computes smallest number that can be divided by each of the numbers from 1 to limit
     * without any remainder
     * @param limit
     * @return
     * @throws EulerMessage
     */
    public int smallestPositive(int limit) throws EulerMessage {
        int n=limit, counter=0;
        while(counter<limit){
            for (int i=1;i<=limit; i++){
                if (n%i != 0){
                    n++;
                    counter=0;
                    break;
                }else{
                    counter++;
                }
            }
        }
        if (counter == limit) {
            return n;
        }else {
            throw new EulerMessage("Smallest multiple not found.");
        }
    }
}
