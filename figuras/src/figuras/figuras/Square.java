package figuras;

public class Square extends DoCalculations {
	double lado;

	public Square(double lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}

}
