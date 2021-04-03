import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\libs\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.quit();
	}

}
