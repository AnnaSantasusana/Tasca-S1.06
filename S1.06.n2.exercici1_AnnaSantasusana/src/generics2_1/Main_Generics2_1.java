package generics2_1;

public class Main_Generics2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person pers1 = new Person("Maria", "Gómez", 32);
		GenericMethods.getElements("Bet", 120, pers1);
		GenericMethods.getElements("Bet", pers1, 120);
		
	}

}
