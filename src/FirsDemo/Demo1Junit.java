package FirsDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Junit {

	private WebDriver driver;

	@Before
	public void brouserSetup() {
		driver = new ChromeDriver();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://google.com");
		Thread.sleep(5000);
	}

	@After
	public void brouserTearDown() {
		driver.quit();
	}

}
