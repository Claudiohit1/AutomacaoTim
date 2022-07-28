package autotim;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElTim;
import metodos.MetodosTim;

public class ActionTim {

	MetodosTim metodos = new MetodosTim();
	ElTim el = new ElTim();

	@Before
	public void setUp() throws Exception {
		metodos.abrirBrowser("https://www.tim.com.br/rj");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharBrowser();
	}

	@Test
	public void test() throws InterruptedException {
		metodos.clicarCoockies(el.cookies);
		metodos.clicarLocal(el.clicarLocal);
		metodos.mudarCidade(el.mudarCidade);
		metodos.clicarLupa(el.clicarLupa);
		metodos.preencherBusca(el.preencherBusca, "Tim Black");
		metodos.scrollNaTela(0, 1780);
		metodos.clicarCoockies2x(el.cookies2x);
		metodos.clicarPlanoTim(el.clicarPlano);
		metodos.clicarTimMenu(el.clicarMenuTim);

	}

}
