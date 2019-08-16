import org.openqa.selenium.WebDriver;


public class AdminPage {

	private WebDriver driver;
	private String url;
	
	public AdminPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/admin");
	}
	
}
