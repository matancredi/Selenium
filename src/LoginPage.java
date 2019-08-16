import org.openqa.selenium.WebDriver;


public class LoginPage {

	private WebDriver driver;
	private String url;
	
	public LoginPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/checkout");
	}
	
}
