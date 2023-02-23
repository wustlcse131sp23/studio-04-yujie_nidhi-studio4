package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(0.5, 0.5, 0.3,0.3);
        
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(0.5,0.5,0.05);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.arc(0.5,0.2,.3,0,180);
        StdDraw.arc(0.5,.8,.3,180,360);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(0.5,0.5,0.05);
	}
}