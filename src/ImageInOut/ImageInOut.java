	//Clasa dedicata citirii si scrierii imaginii in fisier

package ImageInOut;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import Timing.Time;

public class ImageInOut extends Time{
	
	public BufferedImage read(File fin) throws IOException{
		
		start();
		BufferedImage image = null;
		
		try{
			
			image = ImageIO.read(fin);
			System.out.println("Reading complete.");
			}
		
		catch(IOException e){
			
			System.out.println("Error: "+e);
			}
		
		stop();
		
		return image;
	}
	
	public void write(File fout,BufferedImage image) throws IOException{
		
		start();
		try{
			
			ImageIO.write(image, "bmp", fout);
			System.out.println("Writing complete.");
			}
		
		catch(IOException e){
			
			System.out.println("Error: "+e);
			}
		
		stop();
	}
}