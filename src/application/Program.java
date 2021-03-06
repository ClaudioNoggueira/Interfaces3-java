package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
	public static void main(String[] args) {
		AbstractShape s1 = new Circle(Color.AMARELO, 2);
		AbstractShape s2 = new Rectangle(Color.VERDE, 3, 4);
		
		System.out.println("Cor do c�rculo: " + s1.getColor());
		System.out.println("�rea do c�rculo: " + String.format("%.2f", s1.area()));
		System.out.println("Cor do ret�ngulo: " + s2.getColor());
		System.out.println("�rea do ret�ngulo: " + String.format("%.2f", s2.area()));
		
	}
}
