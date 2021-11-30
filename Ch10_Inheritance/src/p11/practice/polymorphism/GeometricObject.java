package p11.practice.polymorphism;

import java.util.Date;

// parent class : 자식 class로 Circle, Rectangle class
public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "dateCreated = " + dateCreated + "\n color = " + color + "color filled = " + filled; 
	}
}









