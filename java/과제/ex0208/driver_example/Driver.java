package driver_example;

public class Driver {
	public void drive(Vehicle vehicle) {
//		��ü Ÿ�� Ȯ�� �κ�
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus) vehicle;
//			bus.checkFare();
//		}
		vehicle.run();
	}
}
