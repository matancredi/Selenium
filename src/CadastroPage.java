import org.openqa.selenium.WebDriver;


public class CadastroPage {

	private WebDriver driver;
	private String url;
	
	public CadastroPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/register.html");
	}
	
}
