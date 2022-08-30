import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
	
	public static void main(String[] args) {
		int result = 0;
		//List<Integer> list = Arrays.asList(0,1,0,0,0,1,0); //3		
		//List<Integer> list = Arrays.asList(0,0,0,1,0,0);	//3
		//List<Integer> list = Arrays.asList(0,0,1,0,0,1,0);	//4
		//List<Integer> list = Arrays.asList(0 ,0, 0, 1 ,0, 0);	//3
		List<Integer> list = Arrays.asList(0, 0, 1 ,0 ,0 ,0 ,0 ,1, 0, 0 ,0 ,0 ,1, 0, 0 ,0 ,0, 0 ,1, 0 ,
				1 ,0 ,0 ,0 ,1, 0 ,0, 1 ,0, 0, 0 ,1, 0 ,1, 0 ,0, 0 ,0 ,0, 0, 0 ,0, 1, 0 ,0 ,1 ,0 ,1, 0, 0);	//28
		
		result = Result2.jumpingOnClouds(list);		
		System.out.println(result);
	}
	
	
//MY SOLUTION
	static class Result2 {
		
		public static int jumpingOnClouds(List<Integer> c) {
			int result = 0;
			int cont = 0;
			int lastC = c.get(0);	
			
			for(int i = 1;i<c.size();i++) {		
				
				if(c.get(i) == 1) {
					System.out.println("soy 1");
					 result++;
					lastC = 1;
					cont = 0;
					continue;
				}		
				
				if(lastC ==0 &&cont < 1) {
					result++;
					cont++;
					continue;
				}
				
				if(lastC == 1) {
					System.out.println("soy un cero pero no pude sumarme "+c.get(i));
				}
				
				lastC = 0;
				System.out.println("cambie de valor : "+lastC);
			}			
			return result;		
		}
	}


}


