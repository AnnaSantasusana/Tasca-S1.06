package genercis2_2;

import java.util.ArrayList;

public class GenericMethods {

	public static <T> void getElements(ArrayList<T> arg) {
		for (int i = 0; i < arg.size(); i++) {
			System.out.println(arg.get(i));
		}
	}
}
