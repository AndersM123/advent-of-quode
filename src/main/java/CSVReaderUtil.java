package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * A utility class for reading CSV files
 */
public class CSVReaderUtil {
	
	/**
	 * Read the ratings.csv and adds each one to the competitors list
	 * @param fileName is the csv file
 	 * @return the list with competitors
	 */
	public static List<Competitor> readCompetitors(String fileName) {
		List<Competitor> competitors = new ArrayList<>();
		
		try (InputStream is = CSVReaderUtil.class.getResourceAsStream("/" + fileName);
			 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
			
			String line = br.readLine(); // Skip header if needed
			while ((line = br.readLine()) != null) {
				
				String[] parts = line.split(",");
				
				// Ensure we are skipping any invalid rows (like an empty line)
				if (parts.length != 4) {
					continue;
				}
				
				int id = Integer.parseInt(parts[0]);
				double spd = Double.parseDouble(parts[1]);
				double str = Double.parseDouble(parts[2]);
				double agl = Double.parseDouble(parts[3]);
				
				Competitor c = new Competitor(id, spd, str, agl);
				competitors.add(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return competitors;
	}
	
	
	/**
	 * Read the obstacle_courses.csv
	 * @param fileName is the csv file
	 * @return the list with obstacles
	 */
	public static List<Obstacle> readObstacles(String fileName) {
		List<Obstacle> obstacles = new ArrayList<>();
		
		try (InputStream is = CSVReaderUtil.class.getResourceAsStream("/" + fileName);
			 BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			
			String line = br.readLine(); // Skip header if needed
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(",");
				
				if (parts.length != 2 ) {
					continue;
				}
				
				ObstacleType type = ObstacleType.valueOf(parts[0]);
				double size = Double.parseDouble(parts[1]);
				
				Obstacle obst = new Obstacle(type, size);
				obstacles.add(obst);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return obstacles;
	}
	
}
