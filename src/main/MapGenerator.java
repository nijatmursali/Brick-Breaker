package main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class MapGenerator {
	
	public int map [][];
	public int brickWidth;
	public int brickHeight;
	
	public MapGenerator(int row, int col) {
		map = new int [row][col];
		for (int i = 0; i < map.length; i++) {
			for (int j=0; j< map[0].length;j++) {
				map[i][j] = 1;
			}
		}
		
		brickWidth = 540/col;
		brickHeight = 150/row;
	}
	
	public void draw(Graphics2D g) {
		Random rand = new Random();
		// Java 'Color' class takes 3 floats, from 0 to 1.
		float rColor = rand.nextFloat();
		float gColor = rand.nextFloat();
		float bColor = rand.nextFloat();
		
		Color randColor = new Color(rColor, gColor, bColor);
		
		for (int i = 0; i < map.length; i++) {
			for (int j=0; j< map[0].length;j++) {
				if(map[i][j] > 0) {
					
					g.setColor(randColor);
					g.fillRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.white);
					g.drawRect(j*brickWidth + 80, i*brickHeight + 50, brickWidth, brickHeight);
				}
			}
			
		}
		
		}
		
	public void setBrickValue(int value, int row, int col) {
		map[row][col] = value;
	}

}