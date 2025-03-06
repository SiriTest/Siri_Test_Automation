package automationTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
		System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
		
		//TC2 go to https://www.facebook.com/login.php
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//click on sign up for face book
		//driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//name = firstname id = u_0_8_u2
		//driver.findElement(By.name("firstname")).sendKeys("Siri");
		//driver.findElement(By.name("firstname")).sendKeys("Siri");
	 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test123");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='loginbutton']"))));
		
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	
	}

}
