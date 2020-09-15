package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestBaseHome.base;

@Listeners(CustomizedListeners.class)
public class mainclass extends base {
	
	
	@BeforeMethod
	public void initialization() {
		setup();
	}
	
	@AfterMethod
	public void quit() {
		teardown();
	}

	@Test
	public void tc1() {
		
		Assert.assertEquals("abc", driver.getTitle());
		
		
	}
	
}
