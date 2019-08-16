import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClientesSystemTest {

	private WebDriver driver;
	private CadastroPage cadastro;
	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mariana\\Downloads\\chromedriver.exe");
		// Substituir pela url do angular
		String url = "file:///C:/Users/Mariana/Downloads/shopper";
		this.driver = new ChromeDriver();
		this.cadastro = new CadastroPage(driver, url);
	}
	
	@Test
	public void deveCadastrarUmUsuario(){
		this.cadastro.visita();
	}
	
	@After
	public void encerrar(){
		//driver.close();
	}
}
