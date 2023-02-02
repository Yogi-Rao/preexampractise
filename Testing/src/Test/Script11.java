package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11 {
	
	public void OpenBrowser()
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chromedriver.driver", "");
		driver.get("https://www.tripadvisor.in/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Script11 o =new Script11();
o.OpenBrowser();
	}

}
