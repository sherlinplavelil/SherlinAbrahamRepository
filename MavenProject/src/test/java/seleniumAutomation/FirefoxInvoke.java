package seleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvoke {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		// TODO Auto-generated method stub

	}

}
