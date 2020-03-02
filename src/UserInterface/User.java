	//Clasa dedicata interactiunii cu utilizatorul

package UserInterface;

import Validation.Validate;
import java.util.Scanner;
import java.io.File;

public class User extends Validate {

	Scanner path = new Scanner(System.in); 
	String pathName1=new String();
	char pos;
	File f;
	
	public File pathIn() {				
		
		start();
		System.out.println("Introduceti calea: ");
	    pathName1 = path.nextLine();  
	    
		while(validPath(pathName1) == 1) {
			
			System.out.println("Introduceti calea: ");
			path = new Scanner(System.in); 
		    pathName1 = path.nextLine();  	
	    }
	     
	    f = new File(pathName1);
	    
	    stop();
	    
	    return f;	  
	   
	}
	
	public void setRotation() {
		
		start();
		System.out.println("Introduceti rotatia(V/H): ");
	    pos =Character.toUpperCase(path.nextLine().toCharArray()[0]);
	    
	    while(validPos(pos) == 1) {
	    	
	    	System.out.println("Introduceti rotatia(V/H): ");
			path = new Scanner(System.in); 
		    pos =Character.toUpperCase(path.nextLine().toCharArray()[0]);
	    }
	    
	    stop();	    
	}
	
	public char getRotation() {
		
		return pos;
	}
	
	
	public File pathOut() {
		
		start();
		File g;
		String pathName2;
		
		//Generare cale salvare fisier
		pathName2 = pathName1.substring(0,pathName1.lastIndexOf('.'))+("_Mirrored_")+pos+(".bmp");
	  
	    g = new File(pathName2);	
	    
	    stop();
	    
		return g;
	}
}
