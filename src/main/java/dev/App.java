package dev;

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
    	while(true){
    		Scanner text = new Scanner(System.in);
    		String asciiArt = FigletFont.convertOneLine(text.next());
    		System.out.println(asciiArt);
    	}
    }
}
