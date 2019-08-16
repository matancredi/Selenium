import org.openqa.selenium.WebDriver;


public class ProdutosPage {

	private WebDriver driver;
	private String url;
	
	public ProdutosPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/products");
	}
	
}
