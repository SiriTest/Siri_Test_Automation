package automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
				System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
				
				WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
				
				//TC2 go to https://www.facebook.com/login.php
				driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
				driver.manage().window().maximize();
				
				//TC 3 wait for 5 sec
				Thread.sleep(3000);
				
				//TC 4 navigate to https://www.selenium.dev/
				driver.navigate().to("https://www.selenium.dev/");
				Thread.sleep(3000);
				
				//TC 5 naviagte back
				driver.navigate().back();
				Thread.sleep(3000);
				
				//TC 6 refresh the page
				driver.navigate().refresh();
				Thread.sleep(3000);
				
				//TC 7 navigate forward
				driver.navigate().forward();
				Thread.sleep(3000);
				
				
				//TC8 close the browser
				driver.close();
				
	}

}
