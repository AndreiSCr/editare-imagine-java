	//Clasa dedicata validarii informatiei date de utilizator

package Validation;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import Timing.Time;

public class Validate extends Time{
	
	public int validPath(String pathName1) {
		
		int i=0;
		
		try {
	        
	    	Paths.get(pathName1);
	    } 
	    catch (InvalidPathException | NullPointerException ex) {
	    
	    	i = 1;
	    }   	
	    
	    if(pathName1.endsWith(".bmp") == false)
	    	i = 1;
	    
	    if(i == 1) 
	    	System.out.println("Cale gresita!"); 
	    
	    return i;
	}
	
	public int validPos(char pos) {
		
		if(pos == 'H'|| pos == 'V')
			
			return 0;
		else {
			
			System.out.println("Optiune nevalida!"); 
			
			return 1;
		}
			
	}
}
