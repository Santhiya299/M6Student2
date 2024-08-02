package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		WebElement ele=driver.findElement(By.xpath("//p[text()='Handpicked Collections for You']"));
		Actions act=new Actions(driver);
		act.scrollToElement(ele).perform();
	}
}
