package genercis3;

public class Generic<T> {

	public static <T extends Telephone> void printTelephone(T arg) {
		arg.call();
		//Aquest mètode no pot cridar al mètode takePictures();
	}
	
	public static <T extends Smartphone> void printSmartphone(T arg) {
		arg.call();
		arg.takePictures();
	}
	
}
