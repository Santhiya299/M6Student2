package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramePro2
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		driver.switchTo().frame(0);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Admin@1234");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Sign Up']"));
		ele.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
