package section2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionClickAndHold
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("//div[@id='circle']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.clickAndHold(element).perform();
		Thread.sleep(3000);
		act.release(element);
		
	}
}


