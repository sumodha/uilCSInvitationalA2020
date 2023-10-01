import java.util.*;
import java.io.*;

public class Keith {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("keith.txt"));
		
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		while(s.hasNextLine()) { 
			double speed = s.nextDouble()/s.nextDouble();
			
			if (speed > max) {
				max = speed;
			}
			if (speed < min) {
				min = speed;
			}
			
			System.out.println(String.format("%.2f", speed));
			
			
		}
		
		System.out.println("Min = " + String.format("%.2f", min)); // rounds to 2 decimal places
		System.out.println("Max = " + String.format("%.2f", max)); // rounds to 2 decimal places
		

	}

}
