package dev;

import java.util.ResourceBundle;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String asciiArtTitre = FigletFont.convertOneLine(titre);
    	System.out.println(asciiArtTitre);
    	String environnement = ResourceBundle.getBundle("application").getString("environnement");
    	System.out.println("Environnement : " + environnement);
    	while(true){
    		String question = ResourceBundle.getBundle("application").getString("question");
        	System.out.println(question);
    		Scanner text = new Scanner(System.in);
    		String asciiArt = FigletFont.convertOneLine(text.nextLine());
    		System.out.println(asciiArt);
    	}
    }
}
