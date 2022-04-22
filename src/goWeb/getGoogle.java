package goWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getGoogle {
	public static void main(String[] args) throws InterruptedException {
		String url = settingURL.Google(args);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		driver.quit();
	}
}
