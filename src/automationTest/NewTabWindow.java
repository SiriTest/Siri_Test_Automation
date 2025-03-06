package automationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewTabWindow {

	public static void main(String[] args) throws InterruptedException {
		//TC 1 Launch or invoke Edge Browser
		//System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver",  "E:\\JAN 2025\\msedgedriver.exe");

		//WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
		WebDriver driver=new ChromeDriver();

		//TC2 go to https://www.facebook.com/login.php
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//TC 3 create new TAB
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		//TC 4 create new WINDOW
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		
		//TC 4 close the browser
		//driver.close();  - to close the active browser window
		driver.quit();		// to close the entire browser
	}

}
