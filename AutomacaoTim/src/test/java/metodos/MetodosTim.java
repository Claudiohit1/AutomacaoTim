package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class MetodosTim extends Drivers {

	public void abrirBrowser(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	public void clicarCoockies(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);

	}

	public void clicarLocal(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);

	}

	public void mudarCidade(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);

	}

	public void clicarLupa(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);

	}

	public void preencherBusca(By elemento, String texto) throws InterruptedException {
		driver.findElement(elemento).sendKeys(texto);
		driver.findElement(elemento).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

	public void scrollNaTela(int n1, int n2) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
		Thread.sleep(1000);

	}

	public void clicarCoockies2x(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);

	}

	public void clicarPlanoTim(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);
	}

	public void clicarTimMenu(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(1000);

	}

	public void fecharBrowser() throws InterruptedException {
		driver.quit();
		Thread.sleep(500);
	}

}
