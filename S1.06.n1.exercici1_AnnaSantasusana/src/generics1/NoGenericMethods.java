package generics1;

public class NoGenericMethods {
	
	private String carBrand1;
	private String carBrand2;
	private String carBrand3;
	
	public NoGenericMethods(String carBrand1, String carBrand2, String carBrand3) {
		this.carBrand1 = carBrand1;
		this.carBrand2 = carBrand2;
		this.carBrand3 = carBrand3;
	}

	public String getCarBrand1() {
		return carBrand1;
	}

	public String getCarBrand2() {
		return carBrand2;
	}

	public String getCarBrand3() {
		return carBrand3;
	}

	public void setCarBrand1(String carBrand1) {
		this.carBrand1 = carBrand1;
	}

	public void setCarBrand2(String carBrand2) {
		this.carBrand2 = carBrand2;
	}

	public void setCarBrand3(String carBrand3) {
		this.carBrand3 = carBrand3;
	}

	@Override
	public String toString() {
		return "carBrand1 = " + carBrand1 + ", carBrand2 = " + carBrand2 + ", carBrand3 = " + carBrand3;
	}
	
	
	
	
}
