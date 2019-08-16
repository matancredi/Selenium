import org.openqa.selenium.WebDriver;


public class IndexPage {

	private WebDriver driver;
	private String url;
	
	public IndexPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/index");
	}
	
}
