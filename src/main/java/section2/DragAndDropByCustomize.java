package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByCustomize
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		ele.sendKeys("i phone 14");
		ele.submit();
		WebElement ele1=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		WebElement ele2=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDropBy(ele1,30,0).perform();
		Thread.sleep(3000);
		act.dragAndDropBy(ele2, -30, 0).perform();
	}
}
