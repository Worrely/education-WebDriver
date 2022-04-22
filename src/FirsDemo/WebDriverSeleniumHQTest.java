package FirsDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSeleniumHQTest {

	private WebDriver driver;

	@Before(alwaysRun = true)
	public void brouserSetup() {
		driver = new ChromeDriver();
	}

	@Test
	public void commonSearchTermReResultsNotEmpty() throws InterruptedException {

		// переход на сайт
		driver.get("http://google.com");
		// поиск поля поиска с ожиданием его появления
		WebElement searchInput = new WebDriverWait(driver, 10)
				.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		// ввод в поисковую строку
		searchInput.sendKeys("1234");
		// поиск кнопки поиска
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		// нажатие кнопки поиска
		searchBtn.click();

		// просто задержка перед закрытием для визуального просмотра
		Thread.sleep(2000);
	}

	@After(alwaysRun = true)
	public void brouserTearDown() {
		driver.quit();
		driver = null;
	}

}
