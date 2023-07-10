package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethods {
	
	@Test(priority=1)
	void openapp() {
		
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login() {
		
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search() {
		
		Assert.assertTrue(false);
		
	}
	
	@Test(priority=4, dependsOnMethods= {"search"})
	void advancesSearch() {
		
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=5,dependsOnMethods= {"login","search"})
	void logout() {
		
		Assert.assertTrue(true);
		
	}

}
