package ui_test_selenium.ui_test_selenium_template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nyo-nyo\\Downloads\\Compressed\\chromedriver_win32_3\\chromedriver.exe");
    	
    	//Creating an object of ChromeDriver
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

    	driver.get("http://www.google.com");
    	System.out.println(driver.getTitle());

    }
}
