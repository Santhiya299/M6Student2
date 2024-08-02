package Section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Locators 
{
	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.flipkart.com/ ");
	Thread.sleep(3000);
	driver.findElement(By.className("Pke_EE")).sendKeys("i phone ");
	}
}
