package TestBaseHome;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class base {
	
	public static WebDriver driver;
	

	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Siddharth\\Study\\Workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}
	
	public void teardown() {
		
		driver.quit();
	}
	
	public void screenshot() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(src, new File("D:\\Siddharth\\Study\\GitRepo\\TestNG_Selenium\\Screeshots\\failedTC.jpg"));
	}

}
