package or.screen;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sairam\\eclipse-workspace\\AutomationSel\\Drivers\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
	 driver.get("https://www.snapdeal.com/");
WebElement s=driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
     s.sendKeys("iphone 7",Keys.ENTER);
     
    driver.findElement
    (By.xpath("//p[text()='Apple iPhone 7 Plus Soft Silicon Cases Wow Imagine - Blue']")).click();
	
    //fetch parId
   String parId= driver.getWindowHandle();
    System.out.println(parId);
    
     // to fettch all win
    Set<String> allwin=driver.getWindowHandles();
    System.out.println(allwin);
  // for(String eachWinId:allwin) {
    //	 if (!eachWinId.equals(parId)) {
		//	driver.switchTo().window(eachWinId);
	//	}
    // }
    //using list
     List<String> l=new LinkedList<String>();
     l.addAll(allwin);
     driver.switchTo().window(l.get(1));
    
	 driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
	WebElement rs=driver.findElement(By.xpath("//div[@class='you-pay']"));
	 String j= rs.getText();
	 System.out.println(j);
}
}
