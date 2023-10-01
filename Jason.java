import java.util.*;
import java.io.*;


public class Jason {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("jason.txt"));
		double num = s.nextDouble(); // number of test cases 
		
		for (int i = 0; i < num; i++) {
			double a = s.nextDouble();
			double b = s.nextDouble();
			double c = s.nextDouble();
			
			double xVertex = -b/(2*a); // finding the x coordinate of the vertex
			double yVertex = a*Math.pow(xVertex,2)+b*xVertex+c; // finding the y coordinate of the vertex
			
			System.out.print("("+String.format("%.3f", xVertex)+","+String.format("%.3f", yVertex)+")"+ "-->");
			
			if (a > 0) {
				System.out.println("UPWARD");
			}
			else System.out.println("DOWNWARD");
		}

	}

}
