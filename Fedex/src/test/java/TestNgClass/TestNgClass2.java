package TestNgClass;


import org.testng.annotations.Test;

public class TestNgClass2 extends TestNgClass3 {
	//@Test(priority=1,groups = { "checkinTests" }, expectedExceptions = ArithmeticException.class)
	public void z ()
	{
		System.out.println("Class z is running");
		int a=10;
		int b=0;
		int sum = 10/0;
		System.out.println(sum);
	}
	@Test(priority=2)
	public void v ()
	{
		System.out.println("Class v is running");
	}
	@Test(priority=3,groups = { "checkinTests" })
	public void x ()
	{
		System.out.println("Class x is running");
	}
	@Test(priority=4)
	public void y ()
	{
		System.out.println("Class y is running");
	}
	@Test(priority=5)
	public void l ()
	{
		System.out.println("Class l is running");
	}


}
