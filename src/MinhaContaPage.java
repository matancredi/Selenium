import org.openqa.selenium.WebDriver;


public class MinhaContaPage {

	private WebDriver driver;
	private String url;
	
	public MinhaContaPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/minha_conta");
	}
	
}
