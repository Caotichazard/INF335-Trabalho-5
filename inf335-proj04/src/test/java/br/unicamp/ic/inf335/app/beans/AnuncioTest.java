package br.unicamp.ic.inf335.app.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

class AnuncioTest {

	@Test
	void getValorTest() {
		ProdutoBean prod = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",100.00,"Mockado");
		ArrayList<URL> fotos = new ArrayList<URL>();
		AnuncioBean anun = new AnuncioBean(prod,fotos,0.20);
		
		
		assertEquals(80.00,anun.getValor());
	}

}
