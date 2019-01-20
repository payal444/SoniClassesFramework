package practice.po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeCRMPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//option[text()=\"Free Edition\"]")
    WebElement Edition;
	
	@FindBy(name="first_name")
    WebElement Firstname;

	@FindBy(how=How.NAME,using="surname")
	WebElement Lastname;
	
	@FindBy(name="email")
	WebElement EmailiD;
	
	@FindBy(name="email_confirm")
	WebElement emailC;
	
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="passwordconfirm")
	WebElement Passwordconfirm;
	
	@FindBy(name="agreeTerms")
	WebElement AgreeTerms;
	
	@FindBy(name="submitButton")
	WebElement SubmitButton;
	
	@FindBy(name="company_name")
	WebElement companyname;
	
	@FindBy(name="phone")
	WebElement phoneN;
	
	@FindBy(name="fax")
	WebElement FAX;
	
	@FindBy(name="website")
	WebElement Website;
	
	@FindBy(name="company_email")
	WebElement company_email;
	
	@FindBy(name="service")
	WebElement service;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postcode")
	WebElement postcode;
	
	@FindBy(name="copy_address")
	WebElement copy_address;
	
	@FindBy(name="btnSubmit")
	WebElement btnSubmit;
	
	public FreeCRMPageFactory(WebDriver driver) {
		this.driver = driver;
	}	
	
	public void Edition() {
		Edition.click();
	}
	
	public void setFirstName(String name) {
		Firstname.sendKeys(name);
	}
	
	public void setlastname(String lastname) {
		Lastname.sendKeys(lastname);
	}
	
	public void Email(String Emailid) {
		EmailiD.sendKeys(Emailid);
	}
	
	public void email_confirm(String EmailIDConfirm) {
		emailC.sendKeys(EmailIDConfirm);
	}
	
	public void username(String Username1) {
		Username.sendKeys(Username1);
	}
	
	public void Password(String PassWord) {
		Password.sendKeys(PassWord);
	}
	
	public void Passwordconfirm(String PasswordConfirm) {
		Passwordconfirm.sendKeys(PasswordConfirm);
	}
	
	public void AgreeTerms() {
		AgreeTerms.click();
	}
	
	public void SubmitButton() {
		SubmitButton.click();
	}
	
	public void companyname(String CompanyN) {
		companyname.sendKeys(CompanyN);
	}
	
	public void phoneN(String phnumber) {
		phoneN.sendKeys(phnumber);
	}
}
