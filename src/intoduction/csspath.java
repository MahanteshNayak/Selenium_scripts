package intoduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csspath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://google.com");     //hit url the browser
	


		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("helloworld");
		driver.findElement(By.cssSelector("#pass")).sendKeys("pass");

	}

}
