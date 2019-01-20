package TestNgClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgClass3 {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("Aftersuite");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	@BeforeGroups
	public void BeforeGroups()
	{
		System.out.println("@BeforeGroups");
	}
	
	@AfterGroups
	public void AfterGroups()
	{
		System.out.println("@AfterGroups");
	}

}
