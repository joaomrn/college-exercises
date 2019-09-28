package operacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Testes {
	Operacoes op1, op2;
	
	@Before
	public void init() {
		op1 = new Operacoes();
		op1 = new Operacoes();
	}
	
	@Test
	public void deveriaComparaDois() {
		assertNotSame(op1, op2);
	}

	@Test
	public void deveriaTestarRaizQuadrada() {
		assertEquals(9.380, op1.raizQuadrada(88),1);
	}
	
	@Test(expected = AssertionError.class)
	public void deveriaTestarDivisao() throws Exception  {
		assertEquals(25, op1.divide(50, 2),0);
		assertEquals(0, op1.divide(50, 0),1);
		assertEquals(0, op1.divide(0, 0),1);
	}
	
	@Test(expected = AssertionError.class)
	public void deveriaTestarProduto() throws Exception  {
		assertEquals(1000000000, op1.produto(1000000 , 1000000 ),1);
	}
	
	@Test
	public void deveriaTestarSoma() {
		double d =(double) 20;
		assertEquals(20,  op1.soma(10, 10), 1);
		assertFalse(21 == op1.soma(10, 10));
		assertTrue(op1.soma(10, 10) == 20);
	}
}
