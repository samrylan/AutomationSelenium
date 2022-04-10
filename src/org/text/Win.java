package org.text;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Win {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 Actions a=new Actions(driver);
	WebElement s=driver.findElement(By.xpath("//input[@type='text']"));
	     s.sendKeys("iphone 13",Keys.ENTER);
	     Thread.sleep(3000);
	   WebElement g= driver.findElement(By.xpath
	    		("//span[text()='Apple iPhone 12 Pro Max, 256GB, Pacific Blue - Unlocked (Renewed Premium)']"));
	    a.contextClick(g).perform();
	    Robot rt= new Robot();
	    for(int i=0;i<2;i++) {
	    	rt.keyPress(KeyEvent.VK_DOWN);
	    	rt.keyRelease(KeyEvent.VK_DOWN);
	    }
	    rt.keyPress(KeyEvent.VK_ENTER);
	    // rt.keyRelease(KeyEvent.VK_ENTER);
	  
	    WebElement t1=driver.findElement(By.xpath("(//span[text()='$1,049.00'])[1]"));
	    String st=t1.getText();
	    System.out.println(st);
	    		
	}
}