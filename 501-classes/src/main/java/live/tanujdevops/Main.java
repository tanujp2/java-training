package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
//		car.make = "Tata";
//		car.model = "Nexon XMS";
//		car.color = "White";
		System.out.println("Make = " + car.getMake());
		System.out.println("Model = " + car.getModel());
		car.describeCar();
	}
}
