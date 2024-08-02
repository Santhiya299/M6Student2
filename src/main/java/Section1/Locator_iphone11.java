package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_iphone11 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.cssSelector("input[name='q']"));
		element.sendKeys("i phone 11");
		element.submit();
		String expected="search";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}
		
}

