package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(0);
		
	}

	
	public void draw()
	{	
		stroke (255);
		line(10, 10, 100, 100); //x1, y1, x2, y2
		circle(300, 250, 70); //cx, cy, diameter
		fill(0, 255, 50);
		rect(10, 300, 20, 100); // tlx, tly, width, height
		fill(0, 0, 255);
		triangle(40, 90, 300, 20, 80, 70); //float x1, float y1, float x2, float y2, float x3, float y3)
		fill(0, 25, 200);
	}
}
