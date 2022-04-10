package org.Auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	
	d.get("http://toolsqa.com/");
	JavascriptExecutor js= (JavascriptExecutor)d;
	//scrolldown
	Thread.sleep(2000);
	WebElement n=d.findElement(By.xpath("//div[text()='Recent Tutorials']"));
     js.executeScript("arguments[0].scrollIntoView(true)",n);
     

	}           
}
