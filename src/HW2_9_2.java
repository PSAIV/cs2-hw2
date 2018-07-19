

public class HW2_9_2 {
		
	public static void main(String args[]){
		
		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.setPreviousClosingPrice(34.5);
		s1.setCurrentPrice(34.35);
		System.out.printf("Price change for %s (%s): %.2f%%", s1.getName(), s1.getSymbol(), s1.getChangePercent());
		
	}
}