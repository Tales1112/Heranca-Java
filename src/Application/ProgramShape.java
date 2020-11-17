package Application;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.ColorEnum;

public class ProgramShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ofshapes");
		int n = sc.nextInt();
		List<Shape> c1 = new ArrayList<>();

		ColorEnum teste;

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (1 + i) + "data:");
			System.out.println("Rectange or Circle (r/c)");
			char b = sc.next().charAt(0);
			if (b == 'r') {
				System.out.println("Color (BLACK/BLUE/RED)");
				teste = ColorEnum.valueOf(sc.next());
				System.out.println("Width:");
				double n1 = sc.nextDouble();
				System.out.println("Height:");
				double n2 = sc.nextDouble();

				c1.add(new Rectangle(n1, n2, teste.toString()));

			} else {
				if (b == 'c') {
					System.out.println("Color (BLACK/BLUE/RED)");
					teste = ColorEnum.valueOf(sc.next());
					System.out.println("Radius:");
					double radius = sc.nextDouble();
					c1.add(new Circle(radius, teste.toString()));
				}
			}
		}
		System.out.println("SHAPE AREAS");
		for (Shape shape : c1) {
			System.out.println(shape.area());
		}
	}

}
