package test;

public class EnumTest {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	
	public static void main(String[] args) {
		Pattern pattern = Pattern.CLUB;
		System.out.println(pattern.value);
		
		Flag flag = Flag.N;
		System.out.println(flag.getTable1Value());
		System.out.println(flag.getTable2Value());
		
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

enum Flag{
	
	Y("1",true),
	N("0",false);
	
	private String table1Value;
	private boolean table2Value;
	
	Flag(String table1Value, boolean table2Value){
		this.table1Value = table1Value;
		this.table2Value = table2Value;
	}
	public String getTable1Value() {
		return table1Value;
	}
	
	public boolean getTable2Value() {
		return table2Value;
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