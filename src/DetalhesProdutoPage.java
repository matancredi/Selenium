import org.openqa.selenium.WebDriver;


public class DetalhesProdutoPage {

	private WebDriver driver;
	private String url;
	
	public DetalhesProdutoPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/product_detail");
	}
	
}
