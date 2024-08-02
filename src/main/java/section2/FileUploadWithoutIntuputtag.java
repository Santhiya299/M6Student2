package section2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWithoutIntuputtag 
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Upload File']"));
		ele.click();
		StringSelection ss=new StringSelection("D:\\Downloads\\Test - 05.pdf");
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		
		
		
		
		
	}
}
