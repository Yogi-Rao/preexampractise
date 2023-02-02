package Test;

import org.openqa.selenium.chrome.ChromeDriver;


public class Script1 {


			ChromeDriver driver;
			String url="https://test.qatechhub.com/";
			public void invokeBrowser()
			{
				System.setProperty("webdriver.chrome.driver","E:\\EclipseWorkspace\\lib\\chromedriver.exe");
			
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
			}
			
			public void closeBrowser()
			{
				driver.close();
			}
			
			public static void main(String args[])
			{
				
				Script1 wc=new Script1();
				wc.invokeBrowser();
				wc.closeBrowser();
			}

		
		// TODO Auto-generated method stub

	}


