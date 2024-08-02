package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOperation1
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(3000);
		String email="Admin@gmail.com";
		String password="Admin@1234";
		String confirmPassword="Admin@1234";
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
		WebElement ele=driver.findElement(By.xpath("//button[text()='Sign Up']"));
		ele.submit();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SuperAdmin@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(" SuperAdmin@1234");
		Thread.sleep(3000);
		WebElement ele2=driver.findElement(By.xpath("//button[text()='Login']"));
		Thread.sleep(3000);
		ele2.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}



















