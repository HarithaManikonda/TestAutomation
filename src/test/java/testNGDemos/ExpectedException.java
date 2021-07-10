package testNGDemos;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void testException() {
		System.out.println("Exception handling test");
		//int i = 1 / 0;	
	}
	
	@Test(expectedExceptions = { IOException.class ,NullPointerException.class})
    public void exceptionTestOne() throws Exception {
        throw new Exception();
    }


}
