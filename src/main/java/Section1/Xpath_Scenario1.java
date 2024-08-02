package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_Scenario1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		element.sendKeys("i phone 14");
		element.submit();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		
		String expected="https://www.flipkart.com/search?q"
				+ "=i%20phone%2014&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off";
		String actual=driver.getCurrentUrl();
		
		String res=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(res);
		
		String expected2=
"https://www.flipkart.com/search?q=i+phone+14&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off&sort=price_asc";		String actual2=driver.getCurrentUrl();
		if(actual.contains(expected)&&actual2.contains(expected2))
			System.out.println("pass");
		
	}
}
