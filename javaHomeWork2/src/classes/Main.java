package classes;

public class Main {

	public static void main(String[] args) {
		
		//referance type
		CustomerManager customerManager= new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		System.out.println("**********************");
		
		//value type 	
		int number1=10;
		int number2=20;
		number2=number1;
		number1=30;
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println("**********************");
		
		//Arrays==referance type
		int[] numbers1=new int[] {1,2,3};
		int[] numbers2=new int[] {4,5,6};
		numbers1=numbers2;
		numbers2[0]=10;
		System.out.println(numbers1[0]);
		System.out.println(numbers2[0]);
		
		
		
		
		
	}

}
