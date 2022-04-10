package org.Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
	WebDriver v=new ChromeDriver();
	v.get("http://demo.guru99.com/test/drag_drop.html");
	v.manage().window().maximize();
	
	Actions d= new Actions(v);
	
	//1
	WebElement s1=v.findElement(By.xpath("//li[@id='credit2']"));
	WebElement s2=v.findElement(By.xpath("//li[@class='placeholder'][1]"));
	d.dragAndDrop(s1, s2).perform();
	
	//2
	WebElement s3=v.findElement(By.xpath("//li[@id='fourth']"));
	WebElement s4=v.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	d.dragAndDrop(s3, s4).perform();
	//3
	WebElement s5=v.findElement(By.xpath("//li[@id='credit1']"));
	WebElement s6=v.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	d.dragAndDrop(s5, s6).perform();
	//4
	WebElement s7=v.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	WebElement s8=v.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	d.dragAndDrop(s7, s8).perform();
	
	
	
	
}
}
