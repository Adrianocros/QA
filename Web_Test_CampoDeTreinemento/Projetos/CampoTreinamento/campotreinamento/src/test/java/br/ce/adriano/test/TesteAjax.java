package br.ce.adriano.test;

import static br.ce.adriano.core.DriverFactory.getDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.adriano.core.DSL;
import br.ce.adriano.core.DriverFactory;

import java.time.Duration;

public class TesteAjax {
	
	private DSL dsl;

	@Before
	public void inicializa(){
		getDriver().get("https://www.primefaces.org/showcase/ui/ajax/basic.xhtml");
		dsl = new DSL();
	}
	
	@After
	public void finaliza(){
		//DriverFactory.killDriver();
	}

	@Test
	public void testAjax(){
		dsl.escrever("j_idt343:name", "Teste");
		dsl.clicarBotao("j_idt343:j_idt347");
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(8));
		wait.until(ExpectedConditions.textToBe(By.id("j_idt343:display"), "Teste"));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("j_idt98")));
		Assert.assertEquals("Teste", dsl.obterTexto("j_idt343:display"));
	}
}
