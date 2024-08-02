package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling_Operation
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("i phone 14");
		ele.submit();
		WebElement elem=driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Purple, 128 GB)']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.scrollToElement(elem);
		
		
	}
}
