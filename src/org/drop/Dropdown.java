package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	
	//to fetch all option
	 Thread.sleep(3000);
        Select s=new Select(driver.findElement(By.name("country")));
       List<WebElement> l=s.getOptions();
       for (int i = 1; i < l.size(); i++) {
    	WebElement t=l.get(i);
    	String attri = t.getAttribute("value");
		System.out.println(attri);
       }

}
}
