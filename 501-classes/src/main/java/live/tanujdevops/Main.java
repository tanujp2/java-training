package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.setMake("Tata");
		car.setModel("Nexon XMS");
		car.setColor("White");
		car.setConvertible(false);
		car.setDoors(4);

		System.out.println("Make = " + car.getMake());
		System.out.println("Model = " + car.getModel());
		car.describeCar();

		Car safari = new Car();
		safari.setMake("Tata");
		safari.setModel("Safari");
		safari.setColor("Black");
		safari.setConvertible(true);
		safari.setDoors(6);

		safari.describeCar();
	}
}
