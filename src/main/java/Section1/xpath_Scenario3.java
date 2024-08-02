package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Scenario3 
{	
	static WebElement element;
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String exp="Dashboard";
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		String act=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		if(act.contains(exp))
			System.out.println("Verified Successfully..");
		driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
		Thread.sleep(3000);
		String actualAdmin=driver.findElement(By.xpath("//h6[contains(@class,'module')]")).getText();
		String expectedAdmin="Admin";
		if(actualAdmin.contains(expectedAdmin))
			System.out.println("Passed Admin Page");
		else
			System.out.println("Fail");
		
		
		driver.quit();
		
}
}
