package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("i phone 14");
		element.submit();
		WebElement  leftBtn=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		WebElement rightBtn=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(leftBtn, 30, 0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(rightBtn, -30, 0).perform();
		
	}
}
