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
		
		
		
		Pattern pattern;
		
		pattern = Pattern.CLUB;
		
		System.out.println(pattern.getNumber());
		
		Drink drink;
		
		drink = Drink.AMERICANO;
		
		System.out.println(drink.getName());
		System.out.println(drink.getCost());
	}

}

enum Gender{
	MALE,FEMALE;
}

enum Pattern{
	SPADE("spade" , "12"),
	HEART("heart","13"),
	DIAMOND("diamond","14"),
	CLUB("club","15");
	
	private String value;
	private String number;
	Pattern(){}
	
	Pattern(String value, String number){
		this.value=value;
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	public String getValue() {
		return value;
	}
	
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