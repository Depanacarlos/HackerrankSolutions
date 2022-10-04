import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlatLandSpaceStation {

	private static final Scanner scan = new Scanner(System.in);

	static int flatlandSpaceStations(int n, ArrayList<Integer> array) {
		Collections.sort(array);
		int max = 0;
		if (n == array.size()) {
			return 0;
		}
		
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			
			if (array.contains(i)) {
				// if the city is a station?
				min = 0;
				continue;
			}
			for (int j = 0; j < array.size(); j++) {

				if (i > array.get(j)) {
					min = i - array.get(j);
				}
				if (i < array.get(j)) {
					if (min > array.get(j) - i) {
						min = array.get(j) - i;
					}
				}
			}
			max = max < min ? min : max;
		}
		return max;
	}

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		int cities = scan.nextInt();
		int station = scan.nextInt();

		for (int x = 0; x < station; x++) {
			array.add(scan.nextInt());
		}

		int result = flatlandSpaceStations(cities, array);

		System.out.printf("resultado %d", result);
	}
}
