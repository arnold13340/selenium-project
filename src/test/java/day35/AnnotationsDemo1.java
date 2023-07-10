package day35;


import org.testng.annotations.*;

public class AnnotationsDemo1 {
	
	
	@BeforeMethod
	void login() {
		System.out.println("login");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("search");
		
	}
	
	@Test(priority=2)
	void advancedsearch() {
		System.out.println("advanced search");
		
	}
	
	@AfterMethod
	void logout() {
		System.out.println("logout");
		
	}

}
