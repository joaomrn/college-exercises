package pkgCalculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ChamaServicoTeste {
	
	ChamaServico calc;
	@Before
	public void setUp() throws Exception {
		ICalculadora ical = Mockito.mock(ICalculadora.class);
		Mockito.when(ical.adicionar(4, 6)).thenReturn(10);
		calc = new ChamaServico();
		calc.setCalc(ical);
	}

	@Test
	public void deveriaSomarDoisNumeros() {
		assertEquals(10, calc.adicionarDoisNumeros(4, 6), 0);
	}

}
