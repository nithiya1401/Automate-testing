package amazonshopping.cart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class CrossBrowserScript {
private static final String TimeUnit = null;
WebDriver driver;
public void setup(String browser) throws Exception{

if(browser.equalsIgnoreCase("firefox")){

    driver = new FirefoxDriver();
}

else if(browser.equalsIgnoreCase("chrome")){
    
    System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
    
    driver = new ChromeDriver();
}
//Check if parameter passed as 'IE'
        else if(browser.equalsIgnoreCase("ie")){
            //set path to IE.exe
            System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
            //create IE instance
            driver = new InternetExplorerDriver();
        }
else{
    //If no browser passed throw exception
    throw new Exception("Browser is not correct");
}
browser = "www.amazon.com";
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		class amazonshoppingcart{
		WebDriver driver;
		public static String driverPath = "C:\\selenium\\";
		public static String sBookKey = "Selenium";
		private static String sBrandName;
		private static final String sSearchBox = "shirt-top-search-box";
		private static final String sSearchResult = "//li[contains(text(),'in')]//span";
		private static final String sShirtBrandName = "(//a[contains(.,'" + sBrandName + "')])[last()]";
		private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";
		private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";
		}
	}
}

