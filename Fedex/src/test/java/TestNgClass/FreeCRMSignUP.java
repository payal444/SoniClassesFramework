package TestNgClass;

import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import practice.base.BaseTest;
import practice.base.BrowserFactory;
import practice.module.NewCompnayModule;
import practice.po.FreeCRMHomePagePO;
import practice.po.FreeCRMLoginPO;
import practice.po.FreeCRMPageFactory;
import practice.po.ImportPo;
import practice.po.NewCompanyPO;
import practice.po.exportpo;
import practice.po.freeCrmSignUp;

public class FreeCRMSignUP extends BaseTest{
	//@Test
	public void signup() throws Exception
	{
		WebDriver driver = BrowserFactory.initializeBrowser(config.getBrowser(), config.url());
		Thread.sleep(4000);
		/*//Simple way to implement POM
		freeCrmSignUp f = new freeCrmSignUp(driver);
	//	f.Edition();
		f.setFirstName("payal");
		f.setLastName("Nimkar");
		f.setEmail("payalnimkar3@gmail.com");
		f.setEmail_confirm("payalnimkar3@gmail.com");
		f.setUsername("Payal123");
		f.setPassword("Horizon123");
		f.setPasswordconfirm("Horizon123");
		f.AgreeTerms();
		f.SubmitButton();*/
		
		
		
		//Using page factory
		FreeCRMPageFactory f= PageFactory.initElements(driver, FreeCRMPageFactory.class);
		f.Edition();
		f.setFirstName("payal");
		f.setlastname("Nimkar");
		f.Email("payalnimkar3@gmail.com");
		f.email_confirm("payalnimkar3@gmail.com");
		f.username("Payal123");
		f.Password("Horizon123");
		f.Passwordconfirm("Horizon123");
		f.AgreeTerms();
		f.SubmitButton();
	}

	@Test
	public void FreeCRMLogin() throws Exception
	{
		WebDriver driver = BrowserFactory.initializeBrowser(config.getBrowser(), config.url());
		SoftAssert soft= new SoftAssert();
		System.out.println("Soft Tokan Started");
		FreeCRMLoginPO po = new FreeCRMLoginPO(driver,soft);
		FreeCRMHomePagePO f = new FreeCRMHomePagePO(driver,soft);
		NewCompnayModule f2 = new NewCompnayModule(driver);
		ImportPo f3 = new ImportPo(driver);
		exportpo f4 = new exportpo(driver);
		po.VerifyTitle();
		po.setusername(config.USERName());
		po.setpassword(config.PassWord());
		po.setLogin();
		f.switchoFrame();
		f.movetoMenuBar("company");
		f2.addValues(excel);
		f.import1();
		f3.choosefile();
		f4.export();
		soft.assertAll();
		System.out.println("Soft Tokan End");
		
		
	}

}

