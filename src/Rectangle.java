

class Rectangle {

	//Fields
	private double width;
	private double height;
	
	//Constructor
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
				
	}
	//Default constructor
	Rectangle() {
		width = 1.0;
		height = 1.0;
		}
	
	//Width getter/setter
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	//Height getter/setter
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	//Derived Methods
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return (width*2) + (height*2);
	}
}