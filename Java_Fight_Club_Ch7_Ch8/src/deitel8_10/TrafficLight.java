package deitel8_10;

public enum TrafficLight {
	RED(60), GREEN(60), YELLOW(10);

	private final int duration;

	private TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
}
