package pacote;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;

public class SalarioLiquidoTeste {

 SalarioLiquido s;

 @Before
 public void setUp() throws Exception {
  s = new SalarioLiquido();
 }

 @Test
 public void deveriaCalcularINSS() {
  assertEquals("case 1", 80, s.calcularINSS(1000.00), 0);
  assertEquals("case 2", 180, s.calcularINSS(2000.00), 0);
  assertEquals("case 3", 330, s.calcularINSS(3000.00), 0);
  assertEquals("case 4", 621.04, s.calcularINSS(8000.00), 0);
 }

 @Test
 public void deveriaCalcularImpostodeRenda() {
  assertEquals(0, s.calcularImpostodeRenda(1000), 0);
  assertEquals("case 1", 150, s.calcularImpostodeRenda(2200.00), 0);
  assertEquals("case 2", 350, s.calcularImpostodeRenda(3000.00), 0);
  assertEquals("case 3", 600, s.calcularImpostodeRenda(4000.00), 0);
  assertEquals("case 3", 900, s.calcularImpostodeRenda(5000.00), 0);

 }

 @Test
 public void deveriaCalcularIRRF() {
  assertEquals(0, s.calcularIRRF(1000), 0);
  assertEquals("case 1", 150, s.calcularIRRF(2200.00), 0);
  assertEquals("case 2", 350, s.calcularIRRF(3000.00), 0);
  assertEquals("case 3", 600, s.calcularIRRF(4000.00), 0);
  assertEquals("case 3", 900, s.calcularIRRF(5000.00), 0);
 }
 
 @Test
 public void deveriaCalcularPlanoOndontologico() {
  assertEquals("case 1", 150, s.calcularPlanoOndontologico(3000.00), 0);
  assertEquals("case 2", 100, s.calcularPlanoOndontologico(2000.00), 0);
  assertEquals(50, s.calcularPlanoOndontologico(1000), 0);
 }
 
 @Test
 public void deveriaCalcularPlanoSaude() {
  assertEquals("case 1", 300, s.calcularPlanoSaude(3000.00), 0);
  assertEquals("case 2", 200, s.calcularPlanoSaude(2000.00), 0);
  assertEquals(100, s.calcularPlanoSaude(1000), 0);
 }
 
 @Test
 public void deveriaCalcularValorHora() {
  assertEquals("case 1", 13.64, s.calcularValorHora(3000.00), 1);
  assertEquals("case 2", 9.09, s.calcularValorHora(2000.00), 1);
  assertEquals(4.55, s.calcularValorHora(1000), 1);
 }
 
 @Test
 public void deveriaCalcularValorHoraExtra() {
  assertEquals("case 1", 409.09, s.calcularValorHoraExtra(3000.00, 30), 1);
  assertEquals("case 2", 272.73, s.calcularValorHoraExtra(2000.00, 30), 1);
  assertEquals(136.36, s.calcularValorHoraExtra(1000, 30), 1);
 }
 
 @Test
 public void deveriaCalcularValorSalarioLiquido() {
  assertEquals("case 1", 2279.09, s.calcularValorSalarioLiquido(3000.00, 30), 1);
  assertEquals("case 2", 1642.09, s.calcularValorSalarioLiquido(2000.00, 30), 1);
  assertEquals(906.36, s.calcularValorSalarioLiquido(1000, 30), 1);
 }
}