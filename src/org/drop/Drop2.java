package org.drop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://output.jsbin.com/osebed/2");
		Thread.sleep(3000);
		//to fetch all option
		Thread.sleep(3000);
		Select m =new Select(driver.findElement(By.id("fruits")));
		m.selectByValue("orange");
		m.selectByVisibleText("Banana");
		m.selectByValue("apple");
		m.selectByValue("grape");
		List<WebElement> l = m.getAllSelectedOptions();
		for (WebElement x : l) {
			System.out.println(x.getText());
		}
			//System.out.println(s);
// get first selected option
	           	}
	
}