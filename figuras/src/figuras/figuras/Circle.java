package figuras;

public class Circle extends DoCalculations {
	double radio;
	
public Circle() {

}

	public Circle(double radio) {
		super();
		this.radio = radio;
	}


	@Override
	public double area() {
		double area=Math.PI*(Math.pow(radio, 2));
		return area;
	}


	@Override
public double perimetro() {
	double perimetro=Math.PI*(2*radio);
	return perimetro;
}

}
