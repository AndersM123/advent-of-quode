package main.java;

public class Obstacle {
	private ObstacleType type;
	private double size;
	
	public Obstacle(ObstacleType type, double size) {
		this.type = type;
		this.size = size;
	}
	
	public ObstacleType getType() {
		return type;
	}
	
	public double getSize() {
		return size;
	}
}
