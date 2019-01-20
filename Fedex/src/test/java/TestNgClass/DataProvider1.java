package TestNgClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	@Test(dataProvider="inputdata")
	public void abc(String datareader) {
		System.out.println("Output of c"+datareader);
	}
	
	@DataProvider(name="inputdata")
	public Object[][] dataP()
	{
		return new Object[][] { { "one"}, {"two" }};

	}

}
