package org.drop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("samrylan");
		driver.findElement(By.id("password")).sendKeys("TLWLSO");
		driver.findElement(By.id("login")).click();
		//select marks
		Select m =new Select(driver.findElement(By.id("location")));
		m.selectByValue("Brisbane");
		Select m1 =new Select(driver.findElement(By.id("hotels")));
         m1.selectByValue("Hotel Sunshine");  
 		Select m2 =new Select(driver.findElement(By.id("room_type")));
        m2.selectByValue("Deluxe");
 		Select m3=new Select(driver.findElement(By.id("room_nos")));
        m3.selectByIndex(4);
 		Select m4 =new Select(driver.findElement(By.id("adult_room")));
 		m4.selectByIndex(2);
 		Select m5 =new Select(driver.findElement(By.id("child_room")));
 		m5.selectByValue("1");
         driver.findElement(By.id("Submit")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("radiobutton_0")).click();
         driver.findElement(By.id("continue")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("first_name")).sendKeys("sam");
         driver.findElement(By.id("last_name")).sendKeys("rylan");
         driver.findElement(By.id("address")).sendKeys("Perubakkam,chennai");
         driver.findElement(By.id("cc_num")).sendKeys("2345768912346785");
         
     
       //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         Select m6=new Select(driver.findElement(By.id("cc_type")));
         m6.selectByValue("VISA");
         Select m7=new Select(driver.findElement(By.id("cc_exp_month")));
         m7.selectByValue("5");
         Select m8=new Select(driver.findElement(By.id("cc_exp_year")));
         m8.selectByValue("2017");
      
         driver.findElement(By.id("cc_cvv")).sendKeys("764");
 
         driver.findElement(By.id("book_now")).click();
         Thread.sleep(8000);
         WebElement e = driver.findElement(By.xpath("//input[@name='order_no']"));
         String s= e.getAttribute("value");
         System.out.println(s);
         
                
}
}