package day36;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email, String pwd) {
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
	    Assert.assertEquals(exp_title, act_title);
		
		
	}
	
	@AfterClass
	void tearDown() {
		
		driver.close();
	}
	
	@DataProvider(name="dp")
	String [][]loginData(){
		
		String data[][]= {
				
				{"abc@gmail.com","test123"},
				{"arnoldjohnson789@gmail.com","Arnold13340"},
				{"arnoldjohnson@gmail.com","john"},
				{"johnh@gmail.com","johnhh"},
				{"johnh@gmail.com","johnhh"}
				
		};
		
		return data;
		
	}

}