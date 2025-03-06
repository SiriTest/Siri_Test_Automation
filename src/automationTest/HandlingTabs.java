package automationTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
		System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface

		//TC2 go to https://www.facebook.com/login.php
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//click on learn more
		driver.findElement(By.linkText("Learn more")).click();
		Thread.sleep(5000);

		//get the window handles or tab
		ArrayList<String> tabs=new ArrayList(driver.getWindowHandles());
		System.out.println(tabs);
		
	

		//shifting from 0th tab to 1st tab
		driver.switchTo().window(tabs.get(1));

		//click on using face book element
		driver.findElement(By.linkText("Using Facebook")).click();
		Thread.sleep(5000);


		//shifting from 1st tab to 0th tab
		driver.switchTo().window(tabs.get(0));


		//click on Privacy Policy

		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(5000);

		//close the browser
		driver.quit();


	}

}
