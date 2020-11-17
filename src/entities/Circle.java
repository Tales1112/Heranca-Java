package entities;

import java.awt.Color;

public class Circle extends Shape {
 private Double radius;
 
	public Circle(Double radius,String cor) {
	super(cor);
	this.radius = radius;
}
	@Override
	public Double area() {
		
		return 3.14 * (radius * radius);
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}

}
