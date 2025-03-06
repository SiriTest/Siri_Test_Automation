package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
				System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
				
				WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
				
				//TC2 go to https://www.facebook.com/login.php
				driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				//Select day from the drop down
				Select day=new Select(driver.findElement(By.id("day")));
				day.selectByIndex(9);
				Thread.sleep(5000);
				
				//Select month from the drop down
				Select month=new Select(driver.findElement(By.name("birthday_month")));
				month.selectByValue("6");
				Thread.sleep(5000);
				
				//Select year from the drop down
				Select year=new Select(driver.findElement(By.name("birthday_year")));
				year.selectByVisibleText("2001");
				Thread.sleep(5000);
				
				//close the browser
				driver.close();
						

	}

}
