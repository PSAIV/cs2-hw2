class QuadraticEquation {
	
	//Fields
	private double a;
	private double b;
	private double c;
	
	//Constructor
	QuadraticEquation(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	//A getter/setter
	public double getA() {
		return a;
	}
	
	public void setA(double x) {
		a = x;
	}
	
	//B getter/setter
	public double getB() {
		return b;
	}
	
	public void setB(double y) {
		b = y;
	}
	
	//C getter/setter
	public double getC() {
		return c;
	}
	
	public void setC(double z) {
		c = z;
	}
	
	//Derived Methods
	public double getDiscriminant() {
		if (Math.pow(b, 2) - 4*a*c == 0) {
			return 0;
		}
		
		else if (Math.pow(b, 2) - 4*a*c < 0) {
			return -1;
		}
		
		else {
			return Math.pow(b, 2) - 4*a*c;
		}
	}
	
	public double getRoot1() {
		if(getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (-b + Math.sqrt(Math.pow(b, 2.0) - (4 * a * c))) / ( 2 * a);
		}
	}
		
	public double getRoot2() {
		if(getDiscriminant() < 0) {
			return 0;
		}
		else {
			return (-b - Math.sqrt(Math.pow(b,  2.0) - (4 * a * c))) / (2 * a);
		}
	}
}