package com.techlab.test;

import com.techlab.model.BarkRecognizer;
import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DogDoorSimulator {
	
	public static void main(String[] args) {
		DogDoor door = new DogDoor();
	    Remote remote = new Remote(door);
	    BarkRecognizer recognizer = new BarkRecognizer(door);
	    
	    
	    System.out.println("Fido barks to go outside...");
	    recognizer.recognize("woof");
	    System.out.println("\nFido has gone outside...");
	    
	    System.out.println("\nFido's all done...");
	    
	    try {
	        Thread.currentThread().sleep(10000);
	      } catch (InterruptedException e) { }
	    
	    
	    System.out.println("...but he's stuck outside!");

	    System.out.println("\nFido starts barking...");
	    recognizer.recognize("Woof");

	    System.out.println("\nFido's back inside...");

	    /*System.out.println("Fido barks to go outside...");
	     * remote.pressButton();

	    System.out.println("\nFido has gone outside...");
	    
	    System.out.println("\nFido's all done...");
	    
	    try {
	        Thread.currentThread().sleep(10000);
	      } catch (InterruptedException e) { }
	    
	    System.out.println("...but he's stuck outside!");

	    System.out.println("\nFido starts barking...");
	    System.out.println("...so Gina grabs the remote control.");
	    remote.pressButton();

	    System.out.println("\nFido's back inside...");*/


	}

}
