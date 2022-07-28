package elementos;

import org.openqa.selenium.By;

public class ElTim {
	
	public By cookies = By.xpath("//div[@aria-label='cookieconsent']//div[2]//a[text()='Aceitar']");
	public By clicarLocal = By.xpath("//button[@class='current-lang']");
	public By mudarCidade = By.xpath("//div[@class='lang-dropdown']//ul//li[26]//a[text()='São Paulo']");
	public By clicarLupa = By.xpath("//div[@class='tim-width-full tim-p-sm']//button//tim-icon");
	public By preencherBusca = By.xpath("//div[@class='tim-width-full tim-p-sm']//input");
	public By cookies2x = By.xpath("//div[@aria-label='cookieconsent']//div[2]//a[text()='Aceitar']");
	public By clicarPlano = By.xpath("//section[@class='tim-accordion-pane-content tim-accordion-pane-content--active']//article//a//div[text()='TIM Black Famíia + Alexa - Planos - Para Você | TIM']");
	public By clicarMenuTim = By.xpath("//div[@data-ic-item='sec-header-secundario']//a//img");

}
