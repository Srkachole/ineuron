package ineuron.javaAssignment;

class Car {
	
	public Car() {
		System.out.println("Car is running");
	}
	public Car(int a) {
		System.out.println("Car is running at: "+a+" Kmph");
	}
}

class Supercar extends Car{
	
	public Supercar() {
		System.out.println("Running very fast");
	}
}


public class Q2 {

	public static void main(String[] args) {
		
		Car car = new Supercar();
		// Output :
		
		// Car is running
		// Running very fast
		
		// Object of child class (supercar) and ref of parent class by default 
		// super() key word gets executed and so parent class no arg constructor
		// gets invoked
		
		
		
		Car car1 = new Car(50);
		
		// Output : 
		
		// Car is running at: 50 Kmph
		
		// Obj and ref of parent class, so parent class constructor gets invoked
		
		
		
		Supercar sc = new Supercar();
		//Output
		
		//Car is running
		//Runnig very fast
		
		// Object and ref of child class (supercar), by default 
		// super() key word gets executed and so parent class no arg constructor
		// gets invoked
		
	}

}
