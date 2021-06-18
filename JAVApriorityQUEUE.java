import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.element.Name;
/*
* Create the Student and Priorities classes here.


*/
class Student{
    String name;
    int id;
    double cgpa;
    public getStudents(String name,int id,double cgpa){
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
    }
     public String getName(){
         return this.name;
     }
     public int getId(){
        return this.id;
    } public double getCgpa(){
        return this.cgpa;
    }
}
class Priorities {
	public List < Student > getStudents(List < String > events) {
		PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getToken));
		List < Student > students = new ArrayList < Student > ();
		for (String e: events) {
			Scanner in =new Scanner(e);
			String event = in.next();
			if (event.equals("ENTER")) {
				String name = in.next();
				float cgpa = in.nextFloat();
				int token = in.nextInt();

				Student student = new Student(token, name, cgpa);
				student_queue.add(student);
			} else if (event.equals("SERVED")) {
				Student first = student_queue.poll();
			} in .close();
		}
		Student first = student_queue.poll();
		if (first == null) {
			return students;
		} else {
			while (first != null) {

				students.add(first);
				first = student_queue.poll();

			}
			return students;
		}

	}
}

public class JAVApriorityQUEUE {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
