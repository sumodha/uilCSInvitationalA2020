import java.util.*;
import java.io.*;

public class Brian {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("brian.txt"));
		int num = s.nextInt();
		
		for (int i = 0; i < num; i++) {
			int year = s.nextInt();
			int version = (year - 1995)/2;
			
			System.out.println("In the year " + year + ", Brian will be coding in Java "+ version + "!");
		} 

	}

}
