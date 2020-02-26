import org.junit.Test;

import static org.junit.Assert.*;

public class TimeoutTest {
    @Test(timeout=1000)
    public void factorialTest(){
        int n = 5;
        System.out.println(Timeout.factorial(n));
    }

}