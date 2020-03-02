	//Clasa dedicata inregistrarii timpului alocat fiecarei operatii in parte

package Timing;

import InterfaceText.InterfacePrint;

public abstract class Time implements InterfacePrint{
	
	long startTime;
	long duration;
	long endTime;
	
	public void start() {
		
		startTime = System.nanoTime();	
		
	}
	
	public void stop() {
		
		endTime = System.nanoTime();	
	}
	
	public float getTime() {
		
		duration = (endTime - startTime)/1000000;
		return ((float)duration)/1000;
	}
}

