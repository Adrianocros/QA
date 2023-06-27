package br.ce.adriano.suites;

import br.ce.adriano.core.DriverFactory;
import br.ce.adriano.test.TesteCadastro;
import br.ce.adriano.test.TesteCampoTreinamento;
import br.ce.adriano.test.TesteRegrasCadastro;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TesteCadastro.class,
	TesteRegrasCadastro.class,
})
public class SuiteTeste {
	@AfterClass //Executa apos a execução da classe, aquarda o fim da execução
	public static void finalizaBrowser(){
		DriverFactory.killDriver();
	}
}
