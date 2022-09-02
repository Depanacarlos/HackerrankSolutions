import java.util.Arrays;
import java.util.List;

public class NewYearCaos {

	public static void main(String[] args) {

		List<Integer> q = Arrays.asList(2,1,5,3,4);
		int n = q.size();
		int count = 0;
		for (int x = 0; x < n; x++) {
			if (q.get(x) - 1 - x > 2) {
				System.out.println("too chaotic");
				return;
			}
			
			for (int y = x-1; y >= q.get(x)-2 && y>=0; y--) {
				if (q.get(y) > q.get(x)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
