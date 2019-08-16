import org.openqa.selenium.WebDriver;


public class DetalhesCompraPage {

	private WebDriver driver;
	private String url;
	
	public DetalhesCompraPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/detalhes_compra");
	}
	
}
