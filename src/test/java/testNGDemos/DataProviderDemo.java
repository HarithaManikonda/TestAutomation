package testNGDemos;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderDemo
{
	@Test(dataProvider = "getData")
	public void loginTest(String Uid,String Pwd)
	{
		System.out.println("Username is:"+Uid);
		System.out.println("Username is:"+Pwd);
		
	}
    @DataProvider(name="getData")
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="user1";
		data[0][1]="pwd1";
		data[1][0]="user2";
		data[1][1]="pwd2";
		return data;
	}

}
