package pkgTesteSuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacoesTeste {
	Operacoes objetoOp;
	
	@Before
	public void setUp() throws Exception {
	objetoOp = new Operacoes();
	}

	@Test
	public void testMaiorValor() {
		assertEquals("Teste 1: ",16, objetoOp.maiorValor(16, 9), 0 );
	}

	@Test
	public void testMenorValor() {
		assertTrue("Teste 2: ", objetoOp.menorValor(16, 9)==9);
	}

	@Test
	public void testProduto() {
		assertFalse("Teste 3: ", objetoOp.produto(16, 5)==81);
	}

}


