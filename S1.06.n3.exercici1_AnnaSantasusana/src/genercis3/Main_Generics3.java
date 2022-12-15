package genercis3;

public class Main_Generics3 {

	public static void main(String[] args) {
		
		Smartphone smartphone1 = new Smartphone("936543218");
		Smartphone smartphone2 = new Smartphone("645394720");
		
		Generic.printTelephone(smartphone1);
		Generic.printSmartphone(smartphone2);
		
	}

}
