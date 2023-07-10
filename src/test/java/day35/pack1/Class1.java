package day35.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc(){
		System.out.println("this is abc from class1");
	}
	
	@BeforeTest
	void m() {
		System.out.println("this is before test method");
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite method");
	}
	
	@AfterSuite
	void as () {
		System.out.println("this is after suite method");
	}

}
