package methods2;

public class Main {

	public static void main(String[] args) {
		
		String message= giveMessage();
		System.out.println(message);
		
		int total= total(16,4);
		System.out.println(total);
		
		int total2=total2(7,8,0,5);
		System.out.println(total2);
	}

	public static void add() {

	}

	public static void delete() {

	}

	public static void update() {

	}
	
	public static String giveMessage() {
		return "İstanbul";
	}
	
	public static int total(int number1, int number2) {
		return number1+number2;
		
	}
	
			//Veriable Arguments
	public static int total2(int... numbers) {
		int total=0;
		
		for (int i = 0; i < numbers.length; i++) {
			total+=i;
		}
		
		return total;
	}

}
