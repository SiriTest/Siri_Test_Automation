package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorEx {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
		System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
		
		//TC2 go to https://www.facebook.com/login.php
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//CLick on Female radio button
		/*driver.findElement(By.id("sex")).click();
		Thread.sleep(5000);
		
		//Click on Male radio button
		driver.findElement(By.id("sex")).click();
		Thread.sleep(5000);*/
		
		//Click on Male radio button
		
		By maleRB=RelativeLocator.with(By.tagName("input")).below(By.name("birthday_month"));
		driver.findElement(maleRB).click();
		Thread.sleep(5000);
		
		
		//close the browser
		driver.quit();
		

	}

}
