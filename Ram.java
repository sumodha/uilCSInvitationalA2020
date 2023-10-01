import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Ram
{
    public static void main(String args[]) throws IOException {
        Scanner s = new Scanner(new File("ram.txt"));
        
        while (s.hasNext()) {
            String w = s.next();
            // accounts for the punctuation at the beginning and end of the word by making its backwards version (so that the reverse method works properly)
            if (Pattern.matches("\\p{IsPunctuation}", w.substring(0,1)) && Pattern.matches("\\p{IsPunctuation}", w.substring(w.length()-1))) { // when the first and last character of the word is punctuation
                w = w.substring(w.length()-1) + w.substring(1, w.length()-1) + w.substring(0,1);
            }
            else if (Pattern.matches("\\p{IsPunctuation}", w.substring(0,1))) { // when the first character of the word is punctuation
                w = w.substring(1) + w.substring(0,1) ;
            }
            else if (Pattern.matches("\\p{IsPunctuation}", w.substring(w.length()-1))) { // when the last character of the word is punctuation
                w = w.substring(w.length()-1) + w.substring(0, w.length()-1);
            }
            
            char[] c = w.toCharArray();
            c = reverse(c); // reverse backwards word so that now its forward i.e normal
            
            for(int i =0; i < c.length; i++) {
                System.out.print(c[i]); // printing each character of the word
            }
            System.out.print(" "); // accounts for spacing between words
        }

        
        
    }
    public static char[] reverse(char[] a) {
        char[] b = new char[a.length];
        
        for (int i =0, j = a.length-1; i < b.length; i++, j--) {
            b[i] = a[j];
        }
        return b;
    }
}
