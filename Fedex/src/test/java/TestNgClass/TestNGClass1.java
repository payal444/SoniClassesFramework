package TestNgClass;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class TestNGClass1 extends TestNgClass3{
	public String BrowserName;
	public TestNGClass1(String string) {
		this.BrowserName = string;
	
	}
	@Test(priority=1,groups = { "checkinTests" },enabled = true)
	public void c ()
	{
		System.out.println("Class C is running");
		System.out.println(BrowserName);
	}
	@Test(priority=2,dependsOnMethods = { "c" })
	public void e ()
	{
		System.out.println("Class e is running");
	}
	@Test(priority=3,groups = { "brokenTests" },enabled = true)
	@Parameters({ "browser" })
	public void a (String browser)
	{
		System.out.println("Class a is running"+ browser);
	}
	@Test(priority=4,groups = { "checkinTests" })
	public void d ()
	{
		System.out.println("Class d is running");
	}
	@Test(priority=5)
	public void f ()
	{
		System.out.println("Class f is running");
	}

	@BeforeMethod

	public void doBeforemethod() {

		System.out.println("testClass1: before test");

	}
	@AfterMethod
	public void doAftermethod() {

		System.out.println("testClass1: After test");

	}


}
