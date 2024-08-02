package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsFashionRightClick
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().perform();
		
		WebElement ele1=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		
		
		
		act.moveToElement(ele1).click().perform();

	}
}
