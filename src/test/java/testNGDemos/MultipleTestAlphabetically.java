package testNGDemos;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestAlphabetically {
	
	@BeforeTest
	
	public void setup() {
		System.out.println("Inside Before Test");
	}
	@AfterTest
	
	public void distroy() {
		System.out.println("Inside After Test");
	}
	
	@Test(priority=4)
	public void  a_test() {
		System.out.println("Inside Testcase A");
		
	}
	@Test(priority=5)
	public void  k_test() {
		System.out.println("Inside Testcase K");
		
	}
	@Test(priority=6)
	public void  l_test() {
		System.out.println("Inside Testcase L");
		
	}
	@Test(priority=3)
	public void  d_test() {
		System.out.println("Inside Testcase D");
		throw new SkipException("Skipping - This is not ready for testing ");

	}
	@Test(priority=1,enabled=false)
	public void  c_test() {
		System.out.println("Inside Testcase C");
	}

	
	@Test(priority=2)
	public void  b_test() {
		System.out.println("Inside Testcase B");
	}





}
