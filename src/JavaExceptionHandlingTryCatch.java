import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		try {
			int x = scan.nextInt();
			int y = scan.nextInt();
			scan.close();
			System.out.println(x/y);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}catch (InputMismatchException e) {
			System.out.println(e.getClass().getName());
		}
		
		throw new Exception();
		
	}

}
