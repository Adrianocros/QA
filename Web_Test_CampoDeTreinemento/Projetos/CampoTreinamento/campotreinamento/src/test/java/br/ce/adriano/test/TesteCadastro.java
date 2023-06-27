package br.ce.adriano.test;

import static br.ce.adriano.core.DriverFactory.getDriver;
import br.ce.adriano.core.BaseTest;
import br.ce.adriano.page.CampoTreinamentoPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCadastro extends BaseTest {
	
	private CampoTreinamentoPage page;

	@Before
	public void inicializa(){
		getDriver().get("http://localhost/CampoDeTreinemento/componentes.html");
		page = new CampoTreinamentoPage();
	}
	

	@Test
	public void deveRealizarCadastroComSucesso(){
		page.setNome("Wagner");
		page.setSobrenome("Costa");
		page.setSexoMasculino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();
		
		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Wagner", page.obterNomeCadastro());
		Assert.assertEquals("Costa", page.obterSobrenomeCadastro());
		Assert.assertEquals("Masculino", page.obterSexoCadastro());
		Assert.assertEquals("Pizza", page.obterComidaCadastro());
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());
		Assert.assertEquals("Natacao", page.obterEsportesCadastro());
	}
}
