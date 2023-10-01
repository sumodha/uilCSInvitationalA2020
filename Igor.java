import java.util.*;
import java.io.*;


public class Igor {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("igor.txt"));
		int num = s.nextInt(); // number of test cases 
		
		for (int i = 0; i < num; i++) {
			String w = s.next();
			char[] c = w.toCharArray();
			
			Arrays.sort(c); // values that repeat will be next to each other
			
			// greatest palindrome value is achieved by using the greatest number of pairs and a single ex. atlanta --> atlta, t, n
			int pair = 0;
			int single = 0;
			for (int j = 0; j < c.length-1; j++) {
				if (c[j] == c[j+1]) {
					pair++;
					j++;
				}
				else single++;	
			}

		
			if (single == c.length-1) { // in the case that all characters are unique
				System.out.println(c.length);
			}
			else if (single > 0) {  // in the case that there us at least one pair and at least one single
				System.out.println((int)Math.pow(pair*2+1, 2)+(single-1));
			}
			else if (single == 0) { // in the case that all characters have pairs
				System.out.println((int)Math.pow(pair*2+1, 2));
			}
		}
		
	
	}

}
