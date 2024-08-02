package section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoPDismissPro
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(4000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(4000);
		alt.dismiss();
		String expect=driver.findElement(By.xpath("//p[text()='You selected Cancel']")).getText();
		Thread.sleep(4000);
		String actual=driver.getCurrentUrl();
		if(actual.contains(expect))
			System.out.println("Pass");
	}
}
