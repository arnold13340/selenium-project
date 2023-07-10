package day36;

import org.testng.annotations.Test;

/*
 loginByEmail-sanity & regression
 loginByfacebook-sanity
 loginBytwitter-sanity
 
 signupbyemail-sanity & regression
 signupbyfacebook - regression
 signupbytwitter-regression
 
 paymentinrupees-sanity & regression
 paymentindollar-sanity
 paymentReturnbybank-regression
 */

public class Grouping {
	
	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail() {
		System.out.println("this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("this is login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginBytwitter() {
		System.out.println("this is login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupByEmail() {
		System.out.println("this is sign up by email");
		
	}
	
	@Test(priority=5,groups= {"regression"})
	void signupByfacebook() {
		System.out.println("this is signup by facebook");
		
	}
	
	@Test(priority=6,groups={"regression"})
	void signupBytwitter() {
		System.out.println("this is signup by twitter");
		
			
	}
	
	@Test(priority=7,groups={"sanity","regression"})
	void paymentinrupees() {
		System.out.println("this is payment in rupees method");
		
	}
	
	@Test(priority=8,groups= {"sanity"})
	void paymentindollar() {
		System.out.println("this is payment id dollar method");
		
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnbyBank() {
		System.out.println("this is payment return by bank");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
