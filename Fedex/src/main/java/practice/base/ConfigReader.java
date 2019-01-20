package practice.base;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;



public class ConfigReader {
	static Properties pro;
	public void readconfig()
	{
		String projectfolder = System.getProperty("user.dir");
		String Filepath = projectfolder + "/GlobalConfig/config.properties";

		try {
			FileReader pfile;
			pfile = new FileReader(Filepath);
			BufferedReader reader = new BufferedReader (pfile);
			pro = new Properties ();
			pro.load(reader);
			reader.close();
			pro.getProperty("Browser");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

	public String getBrowser()
	{
		String browser = pro.getProperty("Browser");
		if(browser!=null)
			return browser;
		else
			throw new RuntimeException("Browser not define");

	}
	
	public  String ExcelPath()
	{
		String Filepath = pro.getProperty("ExcelFile");
		if(Filepath!=null)
			return Filepath;
		else
			throw new RuntimeException("Filepath not define");

	}
	
	public String USERName()
	{
		String Uname = pro.getProperty("Username");
		if(Uname!=null)
			return Uname;
		else
			throw new RuntimeException("Uname not define");

	}
	
	public  String PassWord()
	{
		String PassW = pro.getProperty("Password");
		if(PassW!=null)
			return PassW;
		else
			throw new RuntimeException("PassW not define");

	}
	
	public  String url()
	{
		String Url = pro.getProperty("URL");
		if(Url!=null)
			return Url;
		else
			throw new RuntimeException("Url not define");

	}

}
