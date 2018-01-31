package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
public static WebDriver driver;

public static boolean BrowserIsClosed=true;

public static void BasePage(String Browser,String AppURL){
	if(driver==null && BrowserIsClosed==true){
		if(Browser.equals("Chrome")){
			System.setProperty("google.chrome.Driver", "user.dir"+"//TestSelenium//Chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(AppURL);
			BrowserIsClosed=false;
		}
	}
}


}