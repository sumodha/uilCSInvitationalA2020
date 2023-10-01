import java.util.*;
import java.io.*;

public class Jose {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(new File("jose.txt"));
		
		// creating a hashmap of the possible values (given by the input)
		HashMap<String, Integer> values = new HashMap<>();
		for (int i = 0; i < 23; i++) {
			values.put(s.next(), s.nextInt());
		}
		
		// accounting for numerical values 
		for (int i = 0; i < 10; i++) {
			values.put(Integer.toString(i), i);
		}
		
		// creating a hashmap of the possible weights (given by the input)
		HashMap<Integer, Integer> weight = new HashMap<>();
		for (int i = 0; i < 17; i++) {
			weight.put(s.nextInt(), s.nextInt());
		}
		
	
		int num = s.nextInt(); // number of test cases
		for(int i = 0; i < num; i++) {
			String w = s.next();
			int sum = 0;
			
			char[] a = w.toCharArray();
			
			// finding the sum of the value times weight of each character in the array
			for(int j= 0; j < a.length; j++) {
				if (a[j] != '_') { // the value we need to replace so we ignore it in our math 
					
					sum += values.get(Character.toString(a[j]))*weight.get(j+1);  
				}
			}
			
			int digit = sum % 11;
			
			if (digit >= 10) {
				System.out.println(w.substring(0,8)+'X'+w.substring(9)); // accounts for when the remainder is greater than 9
			}
			else System.out.println(w.substring(0,8)+digit+w.substring(9)); // just uses the digit if the remainder is less than 10
			
		}
		
	
	}

}
