
public class RepeatedString {
	
	public static void main(String[] args) {
		String s = "babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb";
		long n = 860622337747L;
		
		if(!s.contains("a")) {
			System.out.println(0);
			return;
		}
		
		long size = s.length();
		long temp = n/size;
		long left = n-(size*temp);
		int extra = 0;
		
		int count=0;
	    for(char c : s.toCharArray()){
	        if(c=='a')count++;
	    }
	    
	    for(int i=0;i<left;i++){
	        if(s.charAt(i)=='a') extra++;
	    }
	    System.out.println(s.length());
		System.out.println(count);
		System.out.println(left+" left");
		System.out.println(temp+" temp");
		System.out.println(extra+" extra");
		System.out.println((temp*count)+extra);
	}
		
}
