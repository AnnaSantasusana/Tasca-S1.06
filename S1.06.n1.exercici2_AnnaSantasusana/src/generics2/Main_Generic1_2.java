package generics2;

public class Main_Generic1_2 {

	public static void main(String[] args) {
		
		Person pers1 = new Person("Anna", "Santasusana", 28);
		
		GenericMethods.getElements(pers1, "Pepe", 83);
		
		GenericMethods.getElements(12, "Carla", new Person("Joana", "Gonzalez", 54));

	}

}
