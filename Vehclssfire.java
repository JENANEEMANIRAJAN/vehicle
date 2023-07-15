package vehclass;
abstract class vehicle{
	abstract void start();{
		System.out.println("start");
	}
	abstract void stop();{
		System.out.println("stop");
	}
}
class car extends vehicle{ 
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}
}
class motorcycle extends vehicle{
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}
	
}
public class Vehclssfire {

	public static void main(String[] args) {
		motorcycle moto = new motorcycle();
		moto.start();
		moto.stop();
		
		car Car = new car();
		Car.start();
		Car.stop();
		

	}

}
