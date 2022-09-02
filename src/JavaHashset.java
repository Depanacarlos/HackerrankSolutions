import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        s.close();

	//Write your code here
	    HashSet<String> hset = new HashSet<String>();
	    for(int x = 0 ; x < t ; x++){
	        //System.out.println();
	        
	        hset.add (pair_left[x]+" "+pair_right[x]);      
	        System.out.println(hset.size());
	    }
	    
	   }
	}