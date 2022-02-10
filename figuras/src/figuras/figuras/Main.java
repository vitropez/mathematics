package figuras;

import javax.swing.JOptionPane;

public class Main  {

	

	public static void main(String[] args) {
		
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("introduce la opcion que más te apeteada: 1=circunferencia;2=cuadrado"));
		switch (option) {
		case 1: {

			double radio = Double.parseDouble(JOptionPane.showInputDialog("introduce el radio de la circunferencia"));
			Circle round = new Circle(radio);
			double result = round.area();
			System.out.println("el area de la circunferencia es = " + result);
			double resultado = round.perimetro();
			System.out.println("el perimetro de la circunferncia es = " + resultado);
			break;
		}
		
		case 2: {
			double lado = Double.parseDouble(JOptionPane.showInputDialog("introduce el lado del cuadrado"));
			Square square = new Square(lado);
			double result= square.perimetro();
			System.out.println("el perimetro del cuadrado es = " + result);
			break;

		}
		

		}

	}

}
