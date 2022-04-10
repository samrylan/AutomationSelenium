package org.Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://retail.onlinesbi.com/retail/login.htm");
	
	
	d.findElement(By.xpath("(//a[@class=\"login_button\"])[1]")).click();
	//d.switchTo().frame()
	d.findElement(By.xpath("//input[@type='submit']")).click();
}
}
