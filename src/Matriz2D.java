import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matriz2D {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> temp;
		int total = Integer.MIN_VALUE;
		int add = 0;
		try {
			for (int x = 0; x < 6; x++) {
				temp = new ArrayList<>();
				for (int y = 0; y < 6; y++) {
					temp.add(scan.nextInt());
				}
				list.add(temp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// start add

		for (int i = 0; i < 4; i++) {
			for (int z = 0; z < 4; z++) {
				add = list.get(i).get(z) + list.get(i).get(z + 1) + list.get(i).get(z + 2) + list.get(i + 1).get(z + 1)
						+ list.get(i + 2).get(z) + list.get(i + 2).get(z + 1) + list.get(i + 2).get(z + 2);
				if (add > total) {
					total = add;
				}
			}

		}
		System.out.println(total);

	}
}