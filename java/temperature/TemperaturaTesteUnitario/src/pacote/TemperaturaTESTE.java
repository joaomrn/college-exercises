package pacote;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturaTESTE {

	Temperatura objTemp;
	@Before
	public void setUp() throws Exception {
		objTemp = new Temperatura();
	}

	@Test
	public void deveriaConverterCelsiusParaFarenheit() {
		assertEquals("caso 1", 23, objTemp.celsiusParaFarenheit(-5), 0);
		assertEquals("caso 2", 32, objTemp.celsiusParaFarenheit(0), 0);
		assertEquals("caso 3", 64.40, objTemp.celsiusParaFarenheit(18), 0);
	}

	@Test
	public void deveriaConverterCelsiusParaKelvin() {
		assertEquals("caso 4", 268.150, objTemp.celsiusParaKelvin(-5), 0);
		assertEquals("caso 5", 273.150, objTemp.celsiusParaKelvin(0), 0);
		assertEquals("caso 6", 291.150, objTemp.celsiusParaKelvin(18), 0);
	}

	@Test
	public void deveriaClassificarTemperatura() {
		assertTrue("caso 7", "NEGATIVA" == objTemp.classificaTemperatura(-5));
		assertTrue("caso 8", "ZERO" == objTemp.classificaTemperatura(0));
		assertTrue("caso 9", "POSITIVA" == objTemp.classificaTemperatura(18));
	}

	@Test
	public void deveriaValidarConversaoCelsiusFarenheit() {
		assertTrue("caso 10", true == objTemp.validaConversaoCelsiusFarenheit(-5, 23));
	}

}
