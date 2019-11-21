package pkgCalculadora;

public class ChamaServico {
	ICalculadora calc;

	public int adicionarDoisNumeros(int x, int y) {
		return calc.adicionar(x, y);
	}

	public ICalculadora getCalc() {
		return calc;
	}

	public void setCalc(ICalculadora calc) {
		this.calc = calc;

	}
}
