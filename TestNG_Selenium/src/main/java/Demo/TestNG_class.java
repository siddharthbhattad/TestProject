package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_class {

	WebDriver driver = null;
	@Test
	public void m1() {
			
		System.out.println("title = "+driver.getTitle());
		
	}
	
	@Test(dependsOnMethods= {"a"})
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Siddharth\\Study\\Workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
	}
	
	@Test
	public void a() {
		
		System.out.println("a");
		
	}
	
//	@Test
//	public void teardown() {
//		
//			driver.quit();
//	}
	
//	@BeforeTest
//	public void m3() {
//		
//		System.out.println("Before A and B");
//	}
//	
//	@AfterTest
//	public void m4() {
//		
//		System.out.println("After A and B");
//	}
}
