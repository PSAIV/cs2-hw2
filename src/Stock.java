

 class Stock {
	
	//Fields
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	//Constructor
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	//Symbol getter/setter
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String s) {
		symbol = s;
	}
	
	//Name getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	//PreviousClosingPrice getter/setter
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	public void setPreviousClosingPrice(double previous) {
		previousClosingPrice = previous;
	}
	
	//CurrentPrice getter/setter
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(double current){
		currentPrice = current;
	}
	
	//Derived Method
	public double getChangePercent(){
		return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
	}
}