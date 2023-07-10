package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	//Constructor
	
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	//locators
	By img_logo_loc=By.xpath("//div[@class='orangehrm-login-branding']");
	By txt_username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
	
	
	//actionMethods
	
	public void setUserName(String username) {
		
		driver.findElement(btn_submit_loc).sendKeys(username);;
	}
	
	public void password(String password) {
		
		driver.findElement(txt_password_loc).sendKeys(password);
		
	}
	
	public void clickSubmit() {
		
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checklogopresence() {
		
		boolean status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}

}
