package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpProgram
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//section[text()='Popups']")).click();
			driver.findElement(By.xpath("//section[text()='Javascript']")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
			Thread.sleep(6000);
			Alert alt=driver.switchTo().alert();
			String msg=alt.getText();
			Thread.sleep(3000);
			System.out.println(msg);
	}
}
