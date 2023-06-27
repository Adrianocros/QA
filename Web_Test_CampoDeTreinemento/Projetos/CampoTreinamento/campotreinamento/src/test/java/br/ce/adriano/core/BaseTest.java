package br.ce.adriano.core;

import org.junit.After;

import static br.ce.adriano.core.DriverFactory.killDriver;

public class BaseTest {

    @After
    public void finaliza(){
        if(Propriedades.FECHAR_BROWSER)
        killDriver();
    }

}
