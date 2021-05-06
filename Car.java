/**
 * Car class
 * @author Jeffrey Betts
 * date: 5/5/2021
 */
public class Car extends Vehicle {
	private int doors;
	private int passengers;
	public static void main(String[] args) {
		Car aCar = new Car("wow","Wow","Woow",404, 5);
		Car bCar = new Car("wow","Wow","Woow",404, 5);
		System.out.print(bCar.equals(aCar));
		
	}
	public Car(String make, String model, String plate, int doors, int passengers) {
		super(make,model,plate);
		this.doors = doors;
		this.passengers = passengers;
	}
	public int getDoors() {
		return this.doors;
	}
	public int getPassengers() {
		return this.passengers;
	}
	@Override
	public String toString(){
	   String result = "";
	   result = String.format("%d-door %s  %s with license %s", this.doors, super.getMake(), super.getModel(), super.getPlate());
	   return result;
	}
	
	@Override
	/**
	 * @return boolean
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		Car aCar = (Car) obj;
		if(this.doors == aCar.passengers) {
			if(this.passengers == aCar.passengers) {
			return super.equals(obj);
			}
		}
		return false;
	}
	

	public Car copy() {
		String aMake = super.getMake();
		String aModel = super.getModel();
		String aPlate = super.getPlate();
		int theDoors = this.doors;
		int thePassengers = this.passengers;
		
		
		Car newCar = new Car(aMake, aModel, aPlate,theDoors, thePassengers);
		
		return newCar;
	}
}	