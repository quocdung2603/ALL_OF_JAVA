package Bai1.circle;
import java.util.*;
public class Circle {
	double radius=1.0;
	String color = "red";
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	double getArea()
	{
		return Math.PI * Math.PI * this.getRadius();
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
