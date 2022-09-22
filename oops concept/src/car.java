
public class car {

	private String doors;
	private String engine; // properties of car//
	private String driver;
	public int speed;

	public car() {
		doors = "opened";             //default properties//
		engine = "off";
		driver = "absent";
		speed = 0;
	}

	public car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;              //parameterized properties//
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getDoors() {                 //getters//

		return doors;
	}

	public void setDoors(String doors) {               //setters//
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String run() {
		if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		} else                                 //functonalities//
			return "not running";
	}

}
