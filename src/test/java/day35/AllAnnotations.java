package day35;


import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	void bs() {
		
		System.out.println("this is before suit");
		
	}
	
	@AfterSuite
	void as() {
		
		System.out.println("this is after suite");
		
	}
	
	@BeforeTest
	void bt() {
		
		System.out.println("this is before test method");
		
	}
	
	@AfterTest
	void at() {
		
		System.out.println("this is after test method");
		
	}
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class");
	}
	
	@AfterClass
	void ac() {
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before method");
	}
	
	@AfterMethod
	void am() {
		System.out.println("this is aftermethod");
	}
	
	@Test(priority=1)
	void tm1() {
		System.out.println("this is test method1");
	}
	
	@Test(priority=2)
	void tm2() {
		System.out.println("this is test method2");
	}
	
}


