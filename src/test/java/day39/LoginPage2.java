package day39;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	
	public WebDriver driver;
	
	//Constructor
	
	LoginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//Web Elements  locators+identification
	//@FindBy(xpath="//div[@class='orangehrm-login-branding']") 
	@FindBy(how=How.XPATH, using=("//div[@class='orangehrm-login-branding']")) //another way of finding elemen
	WebElement img_logo;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_name;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_submit;
	
	//@FindBy(tagName="a")
	//List<WebElement> links;
	
	
	//actionMethods
	
	public void setUserName(String username) {
		
		txt_name.sendKeys(username);;
	}
	
	public void password(String password) {
		
		txt_password.sendKeys(password);
		
	}
	
	public void clickSubmit() {
		
		btn_submit.click();
	}
	
	public boolean checklogopresence() {
		
		boolean status=img_logo.isDisplayed();
		return status;
	}

}
