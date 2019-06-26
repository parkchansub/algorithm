package test;

public class EnumTest2 {
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	enum Gender{
		MALE, FEMALE
	}
	
	public static void main(String[] args) {
		
		String gender1;
		
		gender1 = EnumTest2.MALE;
		gender1 = EnumTest2.FEMALE;
		
		gender1 = "boy";
		
		
		Gender gender2;
		
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
		/*gender2 = "boy";*/
		
	}
	
}
