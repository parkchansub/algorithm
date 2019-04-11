package test;

public class EnumTest {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	
	public static void main(String[] args) {
		String gender1;
		
		gender1 = EnumTest.FEMALE;
		gender1 = EnumTest.MALE;
		
		gender1 = "boy";
		
		
		System.out.println(gender1);
		
		Gender gender2;
		
		gender2 = Gender.FEMALE;
		gender2 = Gender.MALE;
		
		Drink drink;
		
		drink = Drink.AMERICANO;
		
		
		
		System.out.println(drink.getName());
		System.out.println(drink.getCost());
		
		Pattern pattern=Pattern.CLUB;
		System.out.println(pattern);
		
	}

	
	
	public enum Pattern{
		SPADE("s"),
		HEART("h"),
		DIAMOND("d"),
		CLUB("c");
		private final String value;
		
		Pattern(String v){
			value=v;
		}
		
		public static Pattern fromValue(String v){
			for(Pattern p:Pattern.values()){
				if(p.value.equals(v)){
					return p;
				}
			}
			throw new IllegalArgumentException(v);
		}
	}
}

enum Gender{
	MALE,FEMALE;
}





enum Drink{
	AMERICANO("americano",1500),
	ESPRESSO("espresso",1500),
	CARAMELMACCHIATO("caramelmacchiato",2500),
	CAPPUCCINO("cappuccino",2000);
	
	private String name;
	private int cost;
	
	Drink(){}
	
	Drink(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	public String getName() {
		return name;
	}
	
	
}