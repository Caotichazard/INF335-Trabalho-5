package br.unicamp.ic.inf335.app.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.beans.AnuncianteBean;
import br.unicamp.ic.inf335.beans.AnuncioBean;
import br.unicamp.ic.inf335.beans.ProdutoBean;

class AnuncianteTest {

	@Test
	void addAnuncioTest() {
		ProdutoBean prod = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",100.00,"Mockado");
		ArrayList<URL> fotos = new ArrayList<URL>();
		AnuncioBean anun = new AnuncioBean(prod,fotos,0.20);
		ArrayList<AnuncioBean> anunStart = new ArrayList<AnuncioBean>();
		
		AnuncianteBean anunciante = new AnuncianteBean("Mock Anunciante","0123456789",anunStart);
		
		assertEquals(anunStart,anunciante.getAnuncios());
		assertEquals(anunStart.size(),anunciante.getAnuncios().size());
		
		anunciante.addAnuncio(anun);
		
		ArrayList<AnuncioBean> anunNew = new ArrayList<AnuncioBean>();
		anunNew.add(anun);
		
		
		assertEquals(anunNew,anunciante.getAnuncios());
		assertEquals(anunNew.size(),anunciante.getAnuncios().size());
	}
	
	@Test
	void removeAnuncioTest() {
		ProdutoBean prod = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",100.00,"Mockado");
		ArrayList<URL> fotos = new ArrayList<URL>();
		AnuncioBean anun = new AnuncioBean(prod,fotos,0.20);
		ArrayList<AnuncioBean> anunStart = new ArrayList<AnuncioBean>();
		anunStart.add(anun);
		
		AnuncianteBean anunciante = new AnuncianteBean("Mock Anunciante","0123456789",anunStart);
		
		ArrayList<AnuncioBean> anunEnd = new ArrayList<AnuncioBean>();
		
		assertEquals(anunStart,anunciante.getAnuncios());
		assertEquals(anunStart.size(),anunciante.getAnuncios().size());
		
		anunciante.removeAnuncio(0);
		
		
		assertEquals(anunEnd,anunciante.getAnuncios());
		assertEquals(anunEnd.size(),anunciante.getAnuncios().size());
	}
	
	@Test
	void valorMedioAnunciosTest() {
		
		ProdutoBean prod = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",100.00,"Mockado");
		ArrayList<URL> fotos = new ArrayList<URL>();
		AnuncioBean anun = new AnuncioBean(prod,fotos,0.20);
		
		ProdutoBean prod2 = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",250.00,"Mockado");
		ArrayList<URL> fotos2 = new ArrayList<URL>();
		AnuncioBean anun2 = new AnuncioBean(prod2,fotos,0.20);
		
		ProdutoBean prod3 = new ProdutoBean("mockCodigo","Produto Mockado","Este é um produto mockado",40.00,"Mockado");
		ArrayList<URL> fotos3 = new ArrayList<URL>();
		AnuncioBean anun3 = new AnuncioBean(prod3,fotos,0.50);
		
		
		ArrayList<AnuncioBean> anunStart = new ArrayList<AnuncioBean>();
		
		
		AnuncianteBean anunciante = new AnuncianteBean("Mock Anunciante","0123456789",anunStart);
		
		anunciante.addAnuncio(anun);
		anunciante.addAnuncio(anun2);
		anunciante.addAnuncio(anun3);
		// 80 + 200 + 20 = 300 /3 = 100
		assertEquals(100.00,anunciante.valorMedioAnuncios());
	}

}
