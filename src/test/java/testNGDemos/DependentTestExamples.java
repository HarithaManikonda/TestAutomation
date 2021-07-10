package testNGDemos;

import org.testng.annotations.Test;

public class DependentTestExamples extends ParentDependentTestExample
{
	@Test(dependsOnMethods = { "testOne" })
    public void testThree() {
        System.out.println("Test three method in Inherited test");
    }
 
    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
        //int i=1/0;
    }
}


