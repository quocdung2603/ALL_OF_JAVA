package Bai1.circle;
import java.util.*;
public class Cylinder extends Circle {
	double height = 1.0;
	public Cylinder() {}
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius , double height)
	{
		super(radius);
		this.height= height;
	}
	public Cylinder(double Radius , double height , String color)
	{
		super(Radius, color);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume()
	{
		return Math.PI * this.getHeight() * this.getRadius()* this.getRadius();
	}
}
