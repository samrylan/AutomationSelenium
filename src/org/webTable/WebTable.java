package org.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://demo.guru99.com/test/write-xpath-table.html");
	List<WebElement> all= driver.findElements(By.tagName("tr"));
	 //to fetch row 1
for (int i = 0; i <all.size(); i++) {
	WebElement row = all.get(i);
	//String r = row.getText();

   
List<WebElement> co= driver.findElements(By.tagName("td"));
for (int j = 0; j <co.size() ; j++) {
	WebElement co2 = co.get(j);
	String t = co2.getText();
	if (t.equals("fourth cell")) {
		System.out.println("Name:"+t);
		System.out.println("even:"+(i+1));
	}
}
}
}
}
