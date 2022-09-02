import java.math.BigDecimal;
import java.util.*;

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	public int compareTo(Student o) {
		
		if(this.fname.equals(o.fname) && this.cgpa == o.cgpa) {
			BigDecimal a = new BigDecimal(this.id);
			BigDecimal b = new BigDecimal(o.id);
			return b.compareTo(a);
		}
		else if(this.cgpa == o.cgpa) {
			return this.fname.compareTo(o.fname);
		}
		BigDecimal a = new BigDecimal(this.cgpa);
		BigDecimal b = new BigDecimal(o.cgpa);
		return b.compareTo(a);
	}
}

//Complete the code
public class JavaSort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		
		in.close();
            
		studentList.sort(null);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}