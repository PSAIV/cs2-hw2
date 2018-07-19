

public class HW2_9_1 {
	
	 public static class Rectangle {

		private double width;
		private double height;
		public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
				
		}
		 
		public Rectangle() {
			width = 1.0;
			height = 1.0;
		}
				
		public double getArea() {
			return width * height;
		}
		public double getPerimeter() {
			return (width*2) + (height*2);
		}
	}
	
	public static void main(String args[]) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		
		System.out.printf("Rectangle 1 dimensions: width: %f, height: %f, area: %f, perimeter %f\n",
				r1.width, r1.height, r1.getArea(), r1.getPerimeter());
		System.out.printf("Rectangle 2 dimensions: width: %f, height %f, area: %f, perimeter %f",
				 r2.width, r2.height, r2.getArea(), r2.getPerimeter());
				 
	}
}