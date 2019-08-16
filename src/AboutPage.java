import org.openqa.selenium.WebDriver;


public class AboutPage {

	private WebDriver driver;
	private String url;
	
	public AboutPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/about");
	}
	
}
