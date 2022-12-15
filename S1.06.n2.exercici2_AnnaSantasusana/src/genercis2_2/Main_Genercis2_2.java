package genercis2_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_Genercis2_2 {

	public static void main(String[] args) {
		

		Person pers1 = new Person("David", "Martinez", 12);
		Person pers2 = new Person("Lola", "Ribalta", 40);
		
		ArrayList<Object> list1 = new ArrayList<Object>(Arrays.asList("Poma", 23, pers1));
		GenericMethods.getElements(list1);

		ArrayList<Object> list2 = new ArrayList<Object>(Arrays.asList(pers2, pers1, "Roma", 55, "Manresa"));
		GenericMethods.getElements(list2);
	}

}
