import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Studentt implements Comparable<Studentt> {
	int id;
	String name;
	double cgpa;

	
	Studentt(int id, String name, double cgpa) {
		this.id = id;
		this.cgpa = cgpa;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Studentt student) {
		
		if (this.cgpa == student.cgpa && this.name.equals(student.name)) {
			
			return this.id < student.id ? -1:1;
			
		}else if (this.cgpa == student.cgpa) {
			
			return this.name.equals(student.name)?1:0;
		}
		
		
		return this.cgpa > student.cgpa ? -1:1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}	

}

class Priorities  {
	
	List<Studentt> getStudents(List<String> events){		
		return null;
	}
}

public class JavaPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Studentt> Students = new PriorityQueue<Studentt>();
		Scanner scan = new Scanner(System.in);
		int events = scan.nextInt();
		
		for (int i = 0; i < events; i++) {

			String query = scan.next();
			
			if(query.equals("ENTER")) {
				String name = scan.next();
				double cgpa = scan.nextDouble();
				int id = scan.nextInt();
				Students.add(new Studentt(id, name, cgpa));
			}else if (query.equals("SERVED")) {
				Students.poll();
			}
		}
		
		while(Students.size() > 0) {
			System.out.println(Students.poll().toString()); 
		}
		
	}
}
