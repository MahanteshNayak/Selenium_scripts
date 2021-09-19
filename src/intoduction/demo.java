package intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	//selenium code-
	//create driver object for chrome browser
	
	// we will strictly implement methods of webdriver.
	/* class name=ChromeDriver,
          
          x driver=new x();*/
	public static void main(String[] args) {
		// TODO Auto-generated met
System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://google.com");     //hit url the browser
System.out.println(driver.getTitle());    //validate if your page is correct
System.out.println(driver.getCurrentUrl());   //validate if you are landed on correct url
//System.out.println(driver.getPageSource());   // print page sources.,we can see in browser by rgt click and page nut in bank application rihgt ckisk removed

//driver.navigate().to("http://yahoo.com");
//driver.navigate().back();	// back
//driver.navigate().forward();    //forawrd

//driver.close();       //it closes current browser
//driver.quit();        //it closes all the browsers opened by selenium script


driver.get("https://en-gb.facebook.com/");
driver.findElement(By.id("email")).sendKeys("this is my first code");
driver.findElement(By.name("pass")).sendKeys("123456");
//driver.findElement(By.linkText("Forgotten password?")).click();
//driver.findElement(By.xpath("//*[@id='u_']0_d_5V")).click();
	
	}

}
