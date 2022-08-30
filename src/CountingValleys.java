import java.util.Iterator;
import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//int steps = 12;
		String path = "DDUUDDUDUUUD";

		int result = Result.countingValleys(path);
		System.out.println("valles: ".concat(""+result));
		scan.close();
	}

}

class Result {
	
	public static int countingValleys(String path) {
		int valleys = 0;
		int position= 0;
		
		for(String s : path.split("")) {		
			
			if(s.equals("U")) {				
				position++;
				if(position == 0) {
					valleys++;
				}
				
			}else {
				position--;				
			}
			
		}	
		
		return valleys;
	}
}