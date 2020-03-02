	//Clasa dedicata editarii matricei aferente imaginii

package Matrix;

import java.awt.image.BufferedImage;
import Timing.Time;

public class MatrixView extends Time{

	BufferedImage image = null;
	int[][]  mat;
	int height;
	int width;	
	
	//constructor ce genereaza marticea RGBA corespunzatoare imaginii
	public MatrixView(BufferedImage img) {
		
		start();
		image=img;
		width = image.getWidth();
	    height = image.getHeight();
	    mat = new int[width][height];
	    
	    for(int i=0;i<height;i++)
	    	for(int j=0;j<width;j++)
	    		mat[i][j]=image.getRGB(i, j);
	    
	    stop();
	}
	
	//functie de afisare nefolosita, conceputa pentru testare
	public void show() {
		
		for(int i=0;i<height;i++) {
			
	    	for(int j=0;j<width;j++)
	    		System.out.print(mat[i][j]+" ");
	    	System.out.println();
		}			
	}
	
	//Functie de mirroring a imaginii (orizontal/vertical)
	public void mirror (char pos) {
		
		start();		
		if(pos == 'V')
			for(int i=0;i<height;i++)
				for(int j=0;j<width;j++) {
					
					image.setRGB(height-i-1,j, mat[i][j]);
				}
		
		else
			for(int i=0;i<height;i++)
				for(int j=0;j<width;j++) {
					
					image.setRGB(i,width-j-1, mat[i][j]);
				}	
		
		stop();
	}
}
