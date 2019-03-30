package ie.tudublin;

import processing.core.PVector;
import processing.core.PApplet;

public class Main
{	
		public static void main(String[] args)
	{

		Main main = new Main();
		main.startUI();
	}
	
	//if recognised
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}

	
	
}