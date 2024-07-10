package br.unicamp.ic.inf335.app.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.ProdutoBean;

class ProdutoTest {

	
	@Test
	void compareToTest() {
		ProdutoBean prod = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",150.15,"Mockado");
		ProdutoBean prod2 = new ProdutoBean("mockCodigo2","Produto Mockado","Este é um produto mockado",10.10,"Mockado");
		
		assertEquals(-1,prod2.compareTo(prod));
	
	}

}
