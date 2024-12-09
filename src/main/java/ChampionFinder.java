package main.java;

import java.util.List;

public class ChampionFinder {

	public static void main(String[] args) {
		List<Competitor> competitors = CSVReaderUtil.readCompetitors("ratings.csv");
		List<Obstacle> obstacles = CSVReaderUtil.readObstacles("obstacle_course.csv");
		
		double bestTime = Double.MAX_VALUE;
		int championId = -1;
		
		for (Competitor c : competitors) {
			double total = 0.0;
			
			for (Obstacle o : obstacles) {
				total += TimeCalculator.calculateTime(o, c);
			}
			if (total < bestTime) {
				bestTime = total;
				championId = c.getId();
			}
		}
		
		System.out.println("Champion ID: " + championId);
		System.out.println("Time: " + bestTime);
		
	}
}
