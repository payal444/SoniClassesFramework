package practice.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import practice.base.BasePageObject;

public class freeCrmSignUp extends BasePageObject{
	WebDriver driver;
	By Edition = By.xpath("//option[text()=\\\"Free Edition\\\"]");
	By Firstname=By.name("first_name");
	By lastName=By.name("surname");
	By Email=By.name("email");
	By Email_confirm=By.name("email_confirm");
	By username = By.name("username");
	By password = By.name("password");
	By passwordconfirm = By.name("passwordconfirm");
	By agreeTerms = By.name("agreeTerms");
	By submitButton = By.name("submitButton");

	public freeCrmSignUp(WebDriver driver){
		//this.driver = driver;
		super(driver);
	}

	public By getEdition() {
		return Edition;
	}
	public void Edition() {
		driver.findElement(Edition).click();
	}

	public String getFirstName() {
		return driver.findElement(Firstname).getText();
	}
	public void setFirstName(String fName) {
		driver.findElement(Firstname).sendKeys(fName);
		//type(Firstname,fName);
	}
	public String getLastName() {
		return driver.findElement(lastName).getText();
	}
	public void setLastName(String surname) {
		//	this.lastName = lastName;
		driver.findElement(lastName).sendKeys(surname);
	}
	public String getEmail() {
		return driver.findElement(Email).getText();
	}
	public void setEmail(String email) {
		//Email = email;
		driver.findElement(Email).sendKeys(email);
	}
	public String getEmail_confirm() {
		return driver.findElement(Email_confirm).getText();
	}
	public void setEmail_confirm(String email_confirm) {
		//this.email_confirm = email_confirm;
		driver.findElement(Email_confirm).sendKeys(email_confirm);

	}
	public String getUsername() {
		return driver.findElement(username).getText();
	}
	public String setUsername(String usern) {
		driver.findElement(username).sendKeys(usern);
		return usern;
	}
	public String getPassword() {
		return driver.findElement(password).getText();
	}
	public String setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		return pass;
	}
	public String getPasswordconfirm() {
		return driver.findElement(passwordconfirm).getText();
	}
	public String setPasswordconfirm(String passwordc) {
		driver.findElement(passwordconfirm).sendKeys(passwordc);
		return passwordc;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public By getAgreeTerms() {
		return agreeTerms;
	}

	public void AgreeTerms() {
		driver.findElement(agreeTerms).click();
	}

	public By getSubmitButton() {
		return submitButton;
	}

	public void SubmitButton() {
		driver.findElement(submitButton).click();
	}









}
