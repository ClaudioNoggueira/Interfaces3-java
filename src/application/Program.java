package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		Shape s1 = new Circle(Color.AMARELO, 2);
		Shape s2 = new Rectangle(Color.VERDE, 3, 4);
		
		System.out.println("Cor do círculo: " + s1.getColor());
		System.out.println("Área do círculo: " + String.format("%.2f", s1.area()));
		System.out.println("Cor do retângulo: " + s2.getColor());
		System.out.println("Área do retângulo: " + String.format("%.2f", s2.area()));
		
	}
}
