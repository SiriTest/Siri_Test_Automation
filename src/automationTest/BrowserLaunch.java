package automationTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.*;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException{
		//TC 1 Launch or invoke Edge Browser
		System.setProperty("webdriver.edge.driver",  "E:\\JAN 2025\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();   //EdgeDriver(); - class, WebDriver - interface
		
		//TC2 go to https://www.facebook.com/login.php
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//TC 3 wait for 5 sec
		Thread.sleep(5000);
		
		//TC 4 manage the the window to maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//TC5 get the title of the webpage
		String actalTitle=driver.getTitle();
		System.out.println(actalTitle);
		String expTitle = "Sign up for Facebook";
		if(actalTitle==expTitle)
		{
			System.out.println("You have opened the correct URL");
		}
		else
		{
			System.out.println("You have opened the incorrect URL");
		}
		
		//TC-6 manage the the window to minimize
		driver.manage().window().minimize();
		
		//wait for 5 sec
		Thread.sleep(5000);

		//TC 7 close the browser
		driver.close();
		
		
		

	}

}
