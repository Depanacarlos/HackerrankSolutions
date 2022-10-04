import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Especiales {
	
public static void main(String[] args) {
	Pattern p = Pattern.compile("[\\w]",Pattern.CASE_INSENSITIVE);
	
	ArrayList<String> array = new ArrayList<String>(Arrays.asList("a","b","c","%","S","$"));
	System.out.println(array);
	for (int i = 0; i < array.size(); i++) {
		
		if(!p.matcher(array.get(i)).matches()) {
			array.set(i, "");
		}
	}
	System.out.println(array);
}
}
