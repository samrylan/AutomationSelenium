package org.text;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver s =new ChromeDriver(); 
     s.get("http://toolsqa.com/");
     JavascriptExecutor js=(JavascriptExecutor) s;
     //scroll down
     Thread.sleep(3000);
    WebElement scrll= s.findElement(By.xpath("// div[@id='heading20']"));
     js.executeScript("arguments[0].scrollIntoView(true)",scrll);
     String s1= scrll.getText();
     System.out.println(s1);
       

}
}
