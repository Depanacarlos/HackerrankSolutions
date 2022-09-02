
import java.util.*;
public class JavaDequeue {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Object> deque = new ArrayDeque<>();
        HashSet<Object> hash = new HashSet<>();
        
        int count = Integer.MIN_VALUE;
      	
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hash.add(num);
 
            if(deque.size() == m) {          	
            	count = Math.max(count, hash.size());
            	int top = (int) deque.pop();
            	for(Object a : hash) {
            		System.out.print(a);
            	}
            	System.out.println();
            	if(!deque.contains(top)) {
            		hash.remove(top);
            	}
            }
            
            
        }
        in.close();
       System.out.println(count);
        
    }
}