package section2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FileNameUniqueCalendar 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		Calendar cal=Calendar.getInstance();
		Date dd=cal.getTime();
		Thread.sleep(3000);
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-YYYY  hh-mm-ss");
		String datestamp=sdf.format(dd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys(datestamp);
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(6000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File desc=new File(".\\Screenshotimage\\"+datestamp+"image.png");
		Files.copy(src, desc);
		
		
	}
}
