package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario_5 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Random n=new Random();
		int num=n.nextInt(100000);
		String password="qwer234";
		String email="sandy"+num+"@gmail.com";
		driver.get("https://demowebshop.tricentis.com/");
		String expectedHome="Welcome";
		String  actualHome=driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]")).getText();
		if(actualHome.contains(expectedHome))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		String expectedRegister="Register";
		String actualRegister = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
		if(actualRegister.contains(expectedRegister))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Santhiya");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("M");
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		String expectedResult = "completed";
		String actualResult=driver.findElement(By.xpath("//div[contains(text(),'completed')]")).getText();
		if(actualResult.contains(expectedResult))
			System.out.println("Register Result Page Displayed..");
		else
			System.out.println("Fail");
		
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		
		
		
		
		
		
		
	}
}
