import java.util.BitSet;
import java.util.Scanner;

public class JavaBitset {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int large = scan.nextInt();
		int oper = scan.nextInt();

		BitSet bs1 = new BitSet(large);
		BitSet bs2 = new BitSet(large);
		BitSet[] bs = new BitSet[3];
		bs[1]= bs1;
		bs[2] = bs2;
		
		for (int i = 0; i < oper; i++) {
			String command =scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			switch (command) {
			case "AND":
						bs[a].and(bs[b]);				
				break;
			case "OR":
						bs[a].or(bs[b]);
				break;
			
			case "XOR":
						bs[a].xor(bs[b]);
				break;
			case "FLIP":
						bs[a].flip(b);
				break;
			case "SET":
						bs[a].set(b);
				break;

			default:
				break;
			}			
			//System.out.println(bs1.cardinality()+" "+bs2.cardinality());
			System.out.printf("%d %d %n", bs1.cardinality(),bs2.cardinality());
		}
		
		scan.close();
		
	}
}
