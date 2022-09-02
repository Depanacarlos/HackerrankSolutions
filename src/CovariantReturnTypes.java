import java.util.Scanner;

public class CovariantReturnTypes {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		Region region = null;
		
		try {			
			switch (s) {
			case "WestBengal":
					region = new WestBengal();
				break;
			case "AndhraPradesh":
					region = new AndhraPradesh();
				break;
			default:
				break;
			}			
			Flower flower = region.yourNationalFlower();
			System.out.println(flower.whatsYourName());
			
		} catch (Exception e) {
			System.out.println("incomplete operation");
		}		
	}

}

class Flower {
	
	public String whatsYourName() {
		return this.getClass().getName();	
	}
	
}

class Jasmine extends Flower {
	
}

class Lily extends Flower {
	
}

class Region {
	
	public Flower yourNationalFlower() {
		return new Flower();
	}
	
}

class WestBengal extends Region {
	
	public Flower yourNationalFlower() {
		return new Jasmine();
	}
}

class AndhraPradesh extends Region {
	public Flower yourNationalFlower() {
		return new Lily();
	}
	
}