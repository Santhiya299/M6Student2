package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);

		WebElement LapCharger=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement LapCover=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement LapAccessory=driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
		act.dragAndDrop(LapCharger,LapAccessory).perform();
		act.dragAndDrop(LapCover,LapAccessory).perform();
		
		WebElement mobCharger=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobCover=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobile=driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
		act.dragAndDrop(mobCover, mobile).perform();
		act.dragAndDrop(mobCharger, mobile).perform();
		
		
		
	}
}
