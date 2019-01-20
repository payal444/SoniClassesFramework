package TestNgClass;

import org.testng.annotations.Test;

import practice.base.ConfigReader;

public class propertyfile {
	@Test
	public void file()
	{
		ConfigReader con = new ConfigReader();
		con.readconfig();
		con.getBrowser();
		System.out.println(con.getBrowser());
	}

}
