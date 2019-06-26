package test;

public class EnumTest3 {
	
	public static void main(String[] args) {
		Pattern pattern;
		
		 
	}
	
	enum Pattern{
		SPADE("spade"),
		HEART("heart"),
		DIAMOND("diamond"),
		CLUB("club");
		
		private String value;
		
		Pattern() {}
		
		Pattern(String value) {
			this.value = value;
		}
		
		
	}
}
