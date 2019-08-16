import org.openqa.selenium.WebDriver;


public class CartPage {

	private WebDriver driver;
	private String url;
	
	public CartPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/cart");
	}
	
}
