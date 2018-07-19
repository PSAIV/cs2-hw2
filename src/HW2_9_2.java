
class HW2_9_2 {
	
	static class Stock {
		
		private String symbol;
		private String name;
		private double previousClosingPrice;
		private double currentPrice;
		
		Stock(String symbol, String name){
			this.symbol = symbol;
			this.name = name;
		}
		
		public double getChangePercent(){
			return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
		}
		
		public void setPreviousClosingPrice(double previousClosingPrice) {
			this.previousClosingPrice = previousClosingPrice;
		}
		
		public void setCurrentPrice(double currentPrice){
			this.currentPrice = currentPrice;
		}
	}
	
	public static void main(String args[]){
		
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.setPreviousClosingPrice(34.5);
		s1.setCurrentPrice(34.35);
		System.out.printf("Price change : %.2f%%", s1.getChangePercent());
		
	}
}