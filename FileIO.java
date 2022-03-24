package Unit1;
import java.util.Scanner;
import java.io.*;
public class FileIO {
	public static void main(String[] args) {
		try {
			File wordAlpha = new File("words_alpha.txt");
		    Scanner sc=new Scanner(wordAlpha);
		    for(int i = 0; i < 15; i++ ) {
			    System.out.println(sc.nextLine());
		    }
		    BufferedReader buffer = new BufferedReader(new FileReader(wordAlpha));
		    for(int i = 0; i < 15; i++ ) {
		    	System.out.println(buffer.readLine());
		    }
		    sc.close();
		    buffer.close();
		} catch(IOException e) {
			System.out.print("Error");
		}
	    
	    
	    
	    
		
		
		
		
	}
}
