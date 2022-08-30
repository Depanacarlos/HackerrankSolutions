import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class NewYearCaos {

	public static void main(String[] args) {

		boolean chaotic = false;
		List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);

		HashMap<Integer, Integer> bribes = new HashMap<Integer, Integer>();

		for (int x = 0; x < q.size(); x++) {
			for (int y = x + 1; y < q.size(); y++) {
				if (q.get(x) > q.get(y)) {

					if (bribes.get(q.get(x)) == null) {
						bribes.put(q.get(x), 1);
					} else {
						bribes.put(q.get(x), bribes.get(q.get(x)) + 1);
						if (bribes.get(q.get(x)) > 2) {
							chaotic = true;
							System.out.println("Too chaotic");
							break;
						}
					}

					int temp = q.get(y);
					q.set(y, q.get(x));
					q.set(x, temp);

				}
			}
		}

		if (!chaotic) {
			int count = 0;
			for (Entry<Integer, Integer> map : bribes.entrySet()) {
				count += map.getValue();
			}
			System.out.println(count);
		}

	}

}
