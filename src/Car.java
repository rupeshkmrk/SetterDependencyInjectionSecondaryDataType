
public class Car {
	String carName;
	Engine engine;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getCarName() {
		return carName;
	}
	public Engine getEngine() {
		return engine;
	}
	public void printCarData(){
		System.out.println("Car Name" + " " + carName );
		System.out.println("Model "+engine.getModelYear());
	}
}
