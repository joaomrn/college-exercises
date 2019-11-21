package pkgTesteSuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturaTeste {
	
	Temperatura objetoTemp;
	
	@Before
	public void setUp() throws Exception {
	objetoTemp = new Temperatura();
	}

	@Test
	public void testValidaConversaoCelsiusFarenheit() {
		assertEquals("Teste 4: ", 32, objetoTemp.celsiusParaFarenheit(0), 0);
	}

}
