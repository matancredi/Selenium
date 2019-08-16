import org.openqa.selenium.WebDriver;


public class ContactPage {

	private WebDriver driver;
	private String url;
	
	public ContactPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/contact");
	}
	
}
