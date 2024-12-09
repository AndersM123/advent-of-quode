package main.java;

public class TimeCalculator {

	public static double calculateTime(Obstacle obstacle, Competitor competitor) {
		double size = obstacle.getSize();
		
		double spd = competitor.getSpeed();
		double str = competitor.getStrength();
		double agl = competitor.getSpeed();
		
		switch (obstacle.getType()) {
			case A:
				return size * 6 + (size * 4) / agl + (size * 8) / spd;
			case B:
				return size * 7 + (size * 11) / str + (size * 8) / agl;
			case C:
				return size * 4 + (size * 7) / spd + (size * 9) / agl;
			case D:
                return size * 9 + (size * 6) / str + (size * 6) / agl;
            case E:
                return size * 4 + (size * 4) / spd + (size * 10) / agl;
            case F:
                return size * 11 + (size * 3) / spd + (size * 7) / str;
            case G:
                return size * 2 + (size * 2) / agl + (size * 3) / str;
            case H:
                return size * 8 + (size * 10) / agl + (size * 2) / str;
            case I:
                return size * 2 + (size * 4) / spd + (size * 6) / agl;
            case J:
                return size * 11 + (size * 11) / str + (size * 2) / agl;
            default:
                throw new IllegalArgumentException("Unknown obstacle type");
		}
	}
}
