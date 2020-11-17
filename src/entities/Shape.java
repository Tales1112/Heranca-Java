package entities;

import java.awt.Color;

public abstract  class Shape {
	protected String color;

	public Shape(String color) {
		
		this.color = color;
	}

	public abstract Double area();

}
