package automationTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.interactions.Actions;

public class TestR {

	public static void main(String[] args) throws AWTException {
		
        Robot robot = new Robot();
        
        // Open Calculator (Windows)
        robot.keyPress(KeyEvent.VK_WINDOWS); // Press the Windows key
        robot.keyPress(KeyEvent.VK_R);       // Press the "R" key to open Run
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_R);
        
        // Type 'calc' and press Enter
        robot.keyPress(KeyEvent.VK_C); // Press C
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_A); // Press A
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_L); // Press L
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_C); // Press C
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_ENTER); // Press Enter
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        // Wait for the calculator to open
        robot.delay(2000); // 2-second delay

        // Type '5 + 3' using Robot
        robot.keyPress(KeyEvent.VK_5);  // Press 5
        robot.keyRelease(KeyEvent.VK_5);
        robot.keyPress(KeyEvent.VK_PLUS);  // Press +
        robot.keyRelease(KeyEvent.VK_PLUS);
        robot.keyPress(KeyEvent.VK_3);  // Press 3
        robot.keyRelease(KeyEvent.VK_3);
        robot.keyPress(KeyEvent.VK_ENTER);  // Press Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
