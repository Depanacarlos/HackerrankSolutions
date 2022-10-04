import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
	
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static int  minimumNumber(int n, String password) {
		
		int count = 0;
					
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[\\W]).{6,}");
		Matcher m = p.matcher(password);
		
		if(m.find()) {
			System.out.println("todo ok");
			return 0;
		}
		
		if(!password.matches(".*[\\W].*")) {
			count++;
		}
		if(!password.matches(".*[a-z].*")) {
			count++;
		}
		if(!password.matches(".*[A-Z].*")) {
			count++;
		}
		if(!password.matches(".*[\\d].*")) {
			count++;
		}
		
		if(n+count < 6) {
			return 6-n;
		}		
		
		return count;
	}
	
	public static void main(String[] args) {
		
		//^(?=.*[a-z])(?=.*[A-Z])(?=.*[\d])
		
		int size =Integer.parseInt( scan.nextLine());
		try {
			String chain = scan.nextLine().substring(0,size);
			int result = minimumNumber(size, chain);
			System.out.println(result);
		} catch (IndexOutOfBoundsException i) {
			System.out.println(i);
		}
		
		
		
		scan.close();
		
	}

}
