package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;

public class BaseClass {

	public static WebDriver driver;
	@DataProvider(name="goibiboData")
	public String[][] multipleData() {
		return FileUtil.excelData("./Resources/goibiboData.xlsx", "Sheet1");
	}

	@BeforeClass(alwaysRun=true)
	public void bc(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/Software/chromedriver.exe");
			driver=new ChromeDriver();
		} else  {
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
	}

	@BeforeMethod(alwaysRun=true)
	public void bm() {
	}

	@AfterMethod(alwaysRun=true)
	public void am() {

	}

	@AfterClass(alwaysRun=true)
	public void ac() {
		driver.quit();
	}
}


