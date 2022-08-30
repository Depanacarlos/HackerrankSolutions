import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student2 implements Comparable<Student2> {
	int id;
	String name;
	double cgpa;

	
	Student2(int id, String name, double cgpa) {
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
	public int compareTo(Student2 student) {
		
		if (this.cgpa == student.cgpa && this.name.equals(student.name)) {
			
			return this.id < student.id ? -1:1;
			
		}else if (this.cgpa == student.cgpa) {
			
			return this.name.compareTo(student.name);
		}
		
		
		return this.cgpa > student.cgpa ? -1:1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}	

}

class Prioridad  {
	PriorityQueue<Student2> lista = new PriorityQueue<Student2>();
	List<Student2> otra = new ArrayList<>();
	List<Student2> getStudents(List<String> events){		
		
		for(String e : events) {
			Scanner s = new Scanner(e);
			String query = s.next();
			
			if(query.equals("ENTER")) {
				String name = s.next();
				double cgpa = s.nextDouble();
				int id = s.nextInt();
				lista.add(new Student2(id, name, cgpa));
				
			}else if(query.equals("SERVED")) {
				System.out.println(lista.poll());
			}
		}
		
		while(lista.size() > 0) {
			otra.add(lista.poll());
		}
		
		return otra;
	}
	
	
}

public class JavaPriorityQueue2 {
	
	private final static Scanner scan = new Scanner(System.in);
    private final static Prioridad prioridad = new Prioridad();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student2> students = prioridad.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student2 st: students) {
                System.out.println(st.getName());
            }
        }
       
    }
}
