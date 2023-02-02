
//Script to open Web Browser
package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/");
	}

}
