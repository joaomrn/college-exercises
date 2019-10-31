package pacote;

public class SalarioLiquido {

	 public SalarioLiquido() {
	  // TODO Auto-generated constructor stub
	 }

	 public double calcularINSS(double sal) {
	  // TODO Auto-generated method stub
	  if(sal < 1693.72) {
	   return sal * 0.08;
	  }else if(sal < 2822.90) {
	   return sal * 0.09;
	  }else if(sal < 5645.80) {
	   return sal * 0.11;
	  } else return 621.04;
	  
	 }

	 public double calcularImpostodeRenda(double sal) {
	  // TODO Auto-generated method stub
	  if(sal < 1903.98) {
	   return 0;
	  }else if(sal < 2826.65) {
	   return 150.00;
	  }else if(sal < 3751.05) {
	   return 350;
	  }else if(sal < 4664.68) {
	   return 600;
	  }else return 900.00;
	  
	 }

	 public double calcularIRRF(double sal) {
	  // TODO Auto-generated method stub
	  if(sal < 1903.98) {
	   return 0;
	  }else if(sal < 2826.65) {
	   return 150.00;
	  }else if(sal < 3751.05) {
	   return 350;
	  }else if(sal < 4664.68) {
	   return 600;
	  }else return 900.00;
	  
	 }

	 public double calcularPlanoOndontologico(double sal) {
	  // TODO Auto-generated method stub
	  return sal * 0.05;
	 }

	 public double calcularPlanoSaude(double sal) {
	  // TODO Auto-generated method stub
	  return sal * 0.10;
	 }

	 public double calcularValorHora(double sal) {
	  // TODO Auto-generated method stub
	  return sal/220;
	 }

	 public double calcularValorHoraExtra(double sal, int hora) {
	  // TODO Auto-generated method stub
	  return calcularValorHora(sal) * hora;
	 }

	 public double calcularValorSalarioLiquido(double sal, int hora) {
	  // TODO Auto-generated method stub
	  return sal - calcularINSS(sal) - calcularIRRF(sal) - calcularPlanoOndontologico(sal) - calcularPlanoSaude(sal) + calcularValorHoraExtra(sal, hora);
	 }
}
