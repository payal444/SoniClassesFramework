package TestNgClass;

import org.testng.annotations.Factory;

public class factory {
	@Factory
	public Object [] factoryMethod()
	{
		Object[] tests = new Object[1];
		tests[0] = new TestNGClass1("Chrome");
		//tests[1] = new TestNgClass2();
		return tests;
		
	}
}
