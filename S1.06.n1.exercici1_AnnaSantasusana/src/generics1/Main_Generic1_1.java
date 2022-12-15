package generics1;

public class Main_Generic1_1 {

	public static void main(String[] args) {
	
		NoGenericMethods cars1 = new NoGenericMethods("Audi", "Mazda", "Ferrari");
		
		NoGenericMethods cars2 = new NoGenericMethods("Ferrari", "Audi", "Mazda");

		NoGenericMethods cars3 = new NoGenericMethods("Mazda", "Ferrari", "Audi");
		
		System.out.println(cars1);
		
		System.out.println(cars2);
		
		System.out.println(cars3);
	}

}
