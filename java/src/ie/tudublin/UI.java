package ie.tudublin;

import processing.core.PApplet;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;
//for voice recognition
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Port;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    Window w;
    YellowButtons yb; 
    ArrayList<Science> sciences = new ArrayList<Science>();

    int earth  = 0;
    int def    = 0;
    int vulcan = 0;
    int kronos = 0;
    int safe   = 0; 
    int red    = 0;
    int black  = 0;


    boolean[] keys = new boolean[1024]; 
    // Logger
	private Logger logger = Logger.getLogger(getClass().getName());

	// Variables
	private String result;

	// Threads
	Thread	speechThread;
	Thread	resourcesThread;

	// LiveRecognizer
	private LiveSpeechRecognizer recognizer;
    
    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1024, 700);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen();  
        Configuration configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        configuration.setGrammarPath("resource:/grammars");
		configuration.setGrammarName("grammar");
		configuration.setUseGrammar(true);
    }
    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height / 2, 50);
        w = new Window(this, 512, 250, 1000, 500);
    }
    public void makeDecision( String speech){
        String[] array = speech.split(" ");
		// Find the key word to increment variable for thread below to understand which action to take. 
		if ("earth".equals(array[2])) {
			earth = 1; 
		} else if ("vulcan".equals(array[2])) {
			vulcan = 1;
		} else if ("Kronos".equals(array[2])) {
			kronos = 1;
		} else if ("vulcan".equals(array[2])) {
			vulcan = 1;
        }else if ("red".equals(array[0])){
            red = 1; 
        }else if ("black".equals(array[0])){
            black = 1; 
        }else if ("shields".equals(array[0]) && "up".equals(array[1])){
            def = 1;
        }else if ("lower".equals(array[0]) && "shields".equals(array[1])){
            red = 1; 
        }else if ("cancel".equals(array[0])){
            red   = 0;
            black = 0;
        }
    }
    public void draw()
    {
        red =1; 
        background(255);    
        w.render();
        stars.render();

        if(earth == 1){
            e.render();
        }
        if(vulcan == 1){
            v.render();
        }
        if(kronos == 1){
            k.render();
        }
        if(red == 1){
            background(255,0,0);
        }
        if(black == 1){
            background(80,80,80);
        }


        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

