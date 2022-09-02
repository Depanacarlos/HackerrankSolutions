import java.util.Scanner;

public class JavaFactoryPattern {
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			FoodFactory foodFactory = new FoodFactory();
			Food food = foodFactory.getFood(scan.nextLine());
			scan.close();
			
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
			
		} catch (Exception e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
	}

}

interface Food {
	public String getType();
}

class Pizza implements Food {
	public String getType() {
		return "Someone ordered a Fast Food!";
	}	
}

class Cake implements Food {
	public String getType() {
		return "Someone ordered a Dessert!";
	}	
}

class FoodFactory {
	public Food getFood(String order) {
		
		Food food = null;
		
		if(order.equals("cake")) {
			food = new Cake();
		}
		if(order.equals("pizza")) {
			food = new Pizza();
		}
		
		return food;
		
	}
}