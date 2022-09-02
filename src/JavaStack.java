import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	public static void main (String[] args) 
	{		
				HashMap<String,String> mapa = new HashMap<>();
		        mapa.put("{", "}");
		        mapa.put("[", "]");
		        mapa.put("(", ")");		        
		        
				Scanner sc = new Scanner(System.in);
				Stack<String> stk = new Stack<String>();
				String input=sc.next();
		        stk.push(input);
		        sc.close();
		        while(stk.empty() != true)
		        {	      	
		            String s = stk.pop();
		            List<String> array = new ArrayList<String>(Arrays.asList(s.split("")));     
		            
		            if(s.length()%2 == 0) {		            	
		            	System.out.println( isBalanced(array,mapa));
		            }
		            else {
		            	System.out.println(false);
		            }
		        }
	}	
	
	 public static boolean isBalanced (List<String> array, HashMap<String, String> mapa){
		 int size = array.size();				 
			 
			 for (int i = 1; i < size; i++) {
				 if(mapa.get(array.get(0)) != null) {	
				 
				if ( mapa.get(array.get(0)).equals(array.get(i)) ) {
					System.out.println( array.remove(i));
					System.out.println( array.remove(0));
					size-=2;
					i = 0;
				}
				
			}			 
		 }
		return array.isEmpty();     	
     }	
	 
	 
//	 Map<Character, Character> chars = new HashMap<>();
//     chars.put('{','}');
//     chars.put('(',')');
//     chars.put('[',']');
//     Stack<Character> stack = new Stack<>();
//     for (char c : input.toCharArray()) {
//         // check for open characters
//         if (chars.containsKey(c)) {
//             // add open character to the top of the stack
//             stack.push(c);
//         } else if (stack.empty() || chars.get(stack.pop()) != c) { // if we don't have a match
//             stack.push(c);
//             break;
//         }
//     }
//     System.out.println(stack.empty());
}