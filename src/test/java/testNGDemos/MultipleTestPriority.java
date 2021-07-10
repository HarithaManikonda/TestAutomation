package testNGDemos;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestPriority {
	
	
	@BeforeClass	
	public void  beforeClass() {
		System.out.println("Inside Before Class");
		
	}
	
	
	@AfterClass
	public void  afterClass() {
		System.out.println("Inside After Class");
		
	}
	
	@BeforeSuite	
	public void  beforeSuite() {
		System.out.println("Inside Before Suite");
		
	}
	
	
	@AfterSuite
	public void  afterSuite() {
		System.out.println("Inside After Suite");
		
	}
	
	@BeforeTest	
	public void  beforeTest() {
		System.out.println("Inside Before Test");
		
	}
	
	
	@AfterTest
	public void  afterTest() {
		System.out.println("Inside After Test");
		
	}
	
	@BeforeMethod
	public void  before() {
		System.out.println("Inside Before Method");
		
	}
	
	@AfterMethod
	public void  after() {
		System.out.println("Inside After Method");
		
	}
	
	@Test
	public void  a_test() {
		System.out.println("Inside Testcase A");
		
	}
	@Test
	public void  d_test() {
		System.out.println("Inside Testcase D");
		
	}
	@Test
	public void  c_test() {
		System.out.println("Inside Testcase C");
	}

	
	@Test
	public void  b_test() {
		System.out.println("Inside Testcase B");
	}





}
