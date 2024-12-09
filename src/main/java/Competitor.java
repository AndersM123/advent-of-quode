package main.java;

public class Competitor {
    private int id;          // Unique identifier for the competitor
    private double speed;    // SPD attribute
    private double strength; // STR attribute
    private double agility;  // AGL attribute

    // Constructor
    public Competitor(int id, double speed, double strength, double agility) {
        this.id = id;
        this.speed = speed;
        this.strength = strength;
        this.agility = agility;
    }

    public int getId() {
        return id;
    }

    public double getSpeed() {
        return speed;
    }

    public double getStrength() {
        return strength;
    }

    public double getAgility() {
        return agility;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "id=" + id +
                ", speed=" + speed +
                ", strength=" + strength +
                ", agility=" + agility +
                '}';
    }
}
