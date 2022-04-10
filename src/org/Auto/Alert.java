package org.Auto;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
	
	//switch to frame
	driver.switchTo().frame("login_page");
	driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
	org.openqa.selenium.Alert a= driver.switchTo().alert();
    a.accept();
    driver.switchTo().defaultContent();
}
}
