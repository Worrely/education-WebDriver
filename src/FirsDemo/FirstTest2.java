package FirsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest2 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("I'm Two");

		WebDriver driver = new ChromeDriver();
		driver.get("https://pastebin.com");

		WebElement element = driver.findElement(By.id("postform-text"));
		element.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n"
				+ "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" + "git push origin master --force");
		Thread.sleep(2000);

		WebElement Dropdown = driver.findElement(By.id("postform-expiration"));
		Dropdown.click();
		Select select = new Select(Dropdown);
		select.selectByVisibleText("10 Minutes");
		Thread.sleep(2000);

		WebElement titlname = driver.findElement(By.id("postform-name"));
		titlname.sendKeys("helloweb");
		Thread.sleep(2000);

		WebElement btnOK = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
		btnOK.click();
		Thread.sleep(8000);

		driver.getPageSource().contains("git config --global user.name  \"New Sheriff in Town\"\n"
				+ "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" + "git push origin master --force");
		WebElement TitleName = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/h1 [text()='helloweb']"));

		driver.quit();

	}

}
