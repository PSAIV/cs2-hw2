

public class RectangleTest {
		
	public static void main(String args[]) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		
		System.out.printf("Rectangle 1 dimensions: width: %.2f, height: %.2f, area: %.2f, perimeter %.2f\n",
				r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
		System.out.printf("Rectangle 2 dimensions: width: %.2f, height %.2f, area: %.2f, perimeter %.2f",
				 r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
				 
	}
}
