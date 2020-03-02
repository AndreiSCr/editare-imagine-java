package Main;

import java.awt.image.BufferedImage;
import ImageInOut.ImageInOut;
import java.io.IOException;
import UserInterface.User;
import Matrix.MatrixView;
import java.io.File;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		ImageInOut io = new ImageInOut();
		BufferedImage image = null;
		float [] time=new float[7];	
		User us = new User();
		File fin = null;
		File fout = null;
			
		//Citire cale IN fisier  
		fin=us.pathIn();
		time[0]=us.getTime();
		
		//Citire tip rotatie
		us.setRotation();
		time[1]=us.getTime();
		
		//Setare cale OUT fisier
		fout=us.pathOut();
		time[2]=us.getTime();
		
		//Citire imagine
		image= io.read(fin);
		time[3]=io.getTime();
		
		//Creare matrice corespunzatoare valorilor RGBA ale imaginii
		MatrixView mat =new MatrixView(image);
		time[4]=mat.getTime();
		
		//Realizare mirroring imagine		
		mat.mirror(us.getRotation());
		time[5]=mat.getTime();
		
		//Scriere imagine in fisier
		io.write(fout, image);
		time[6]=io.getTime();
		
		System.out.println("Timpii corespunzatori fiecatui task (s)");
		System.out.println("Timp citire cale IN: "+time[0]);
		System.out.println("Timp citire rotatie: "+time[1]);
		System.out.println("Timp generare cale OUT: "+time[2]);
		System.out.println("Timp citire imagine: "+time[3]);
		System.out.println("Timp creare matrice: "+time[4]);
		System.out.println("Timp realizare proces de mirroring: "+time[5]);
		System.out.println("Timp scriere imagine: "+time[6]);		
	}
}
