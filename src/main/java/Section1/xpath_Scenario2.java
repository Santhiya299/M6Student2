package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Scenario2
{
	public static void main(String[] args) throws Exception
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		element.sendKeys("i phone 14");
		element.submit();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']")).click();
		Thread.sleep(3000);
		driver.quit();		
	}
}
