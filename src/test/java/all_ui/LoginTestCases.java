package all_ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {

	@Test(description="Verify that the user is successfully logged in.")
	public void testLogin(){
		
		String expectedPageTitle = "Logged In Successfully | Practice Test Automation";
		
		//setting the chrome driver for the entire test
		System.setProperty("webdriver.chrome.driver","resources/chromedriver-win64/chromedriver.exe");
		//initiating web browser
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://practicetestautomation.com/practice-test-login/";
        driver.get(baseUrl);
        System.out.println("Launch Browser");
        
        //executing test case steps
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
        System.out.println("Input Username");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
        System.out.println("Input Password");
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        System.out.println("Click Submit");
        
        String actualPageTitle = driver.getTitle();
        
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Page Tittle Verification Failed");
        System.out.println("Verify Page Tittle");
        
        driver.close();
		
	}
	
}
