package section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		ele.sendKeys("i phone 13");
		ele.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
		Thread.sleep(6000);
		String parentId=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
		if(!ids.equals(parentId));
			driver.switchTo().window(id);
		}	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click(); 
//--->//*[local-name()='svg' and @class="NwyjNT" ]-->we can use this way also to locate an element
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
	}
}
