package Sel.OrangeTDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import Data.Data;
import Mainmethod.MainClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLoginTest {

	static WebDriver driver;

	@BeforeMethod
	public void OpenUrl() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "d1", dataProviderClass = Data.class)
	public void Login_test1(String User, String pass) {

		MainClass.Login2(User, pass, driver);

	}

	@Test
	public void operation_test() throws InterruptedException {

		MainClass.Login("Admin", "admin123", driver);
		MainClass.operation(driver,"BlackPink");
		MainClass.check_delete(driver,"BlackPink");
	}

	@Test
	public void Logout_test3() throws InterruptedException {

		MainClass.Login("Admin", "admin123", driver);
		MainClass.operation(driver,"soham");
		MainClass.check_delete(driver,"soham");
		MainClass.logout(driver);
	}

	@AfterMethod
	public void closebwoser() {
		driver.close();
	}

}
