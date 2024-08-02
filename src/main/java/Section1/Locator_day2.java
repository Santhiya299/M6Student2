package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_day2 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expectedResult = "Login";
		String actualResult = driver.getCurrentUrl();
	
		if( actualResult.contains(expectedResult) )
			System.out.println("pass");
		else
			System.out.println("Fail");
		driver.findElement(By.cssSelector("input [placeholder=\"Username\"]")).sendKeys("Admin");
		WebElement element=driver.findElement(By.cssSelector("input [placeholder=\"Password\"]"));
		element.sendKeys("admin123");
		driver.findElement(By.cssSelector
("button [class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"))
		.click();

	}
}
