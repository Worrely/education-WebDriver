package FirsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver ();
        driver.get ("http://google.com");
        driver.quit();
	}
	
}
