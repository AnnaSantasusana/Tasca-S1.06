package genercis3;

public class Smartphone implements Telephone{

	private String number;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String number) {
		this.number = number;
	}
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public void call() {
		System.out.println("The phone number " + this.getNumber() + " is calling.");
	}
	
	public void takePictures() {
		System.out.println("The phone number " + this.getNumber()+ " is taking pictures.");
	}

}
