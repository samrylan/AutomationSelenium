package org.text;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlng {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
		 driver.get(" http://www.greenstechnologys.com/");
		     Actions a = new Actions(driver);
		     Thread.sleep(3000);
		 WebElement g4 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 a.moveToElement(g4).perform();
	Thread.sleep(5000);
	    driver.findElement(By.xpath("(//span[text()='Python'])[1]']")).click();
	    Thread.sleep(3000);
	     WebElement g1 = driver.findElement(By.xpath("(//section[@id=\"usdinr\"])[2]"));
	     a.moveToElement(g1).perform();
	     
	     WebElement g3 = driver.findElement(By.xpath("//h2[text()='Curriculum']"));
	     a.contextClick(g3);
          //to fetch parId
	   String parId= driver.getWindowHandle();
	   System.out.println(parId);
	   //to fetch allWin
	  Set<String> allWin= driver.getWindowHandles();
	  System.out.println(allWin);
	    
	 //list
      List<String>l=new LinkedList<String>();
	  l.addAll(allWin);
	  driver.switchTo().window(l.get(1));
	  
}
}