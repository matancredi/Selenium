import org.openqa.selenium.WebDriver;


public class ConfirmacaoCompraPage {

	private WebDriver driver;
	private String url;
	
	public ConfirmacaoCompraPage(WebDriver driver, String url){
		this.driver = driver;
		this.url = url;
	}
	
	public void visita(){
		driver.get(url + "/confirmaca_compra");
	}
	
}
