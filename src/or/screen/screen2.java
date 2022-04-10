package or.screen;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screen2 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe" );
	WebDriver driver= new ChromeDriver();
	
	         
	driver.get("https://www.amazon.in/");
	
	WebElement d=driver.findElement(By.xpath("//input[@name='field-keywords']"));
	d.sendKeys("motorola");
	    //to take screenshot
	Thread.sleep(2000);
	    TakesScreenshot ts=(TakesScreenshot)driver;
	   File src= ts.getScreenshotAs(OutputType.FILE);
	   File Dest=new File("C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\screenshot\\q.png");
	   FileUtils.copyFileToDirectory(src, Dest);
}
}
