import java.util.Scanner;

class Student {
	
	private int id;
	private String name;
	private int[] marks = new int[10];
	private float average;
	private char grade;
	
	public Student(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void calculateAvg(float avg) {
		setAverage(avg);
	}
	
	public void findGrade() {
		
		float avg = getAverage();
		
		if ((avg<=100) && (avg>80)) {
			setGrade('O');
		}
		else if (avg<50) {
			setGrade('F');

		}
		else {
			setGrade('A');

		}
		
	}
	
 	
}

public class grade{
	public static Student getStudentDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the id : ");
		int id = sc.nextInt();

		System.out.print("Enter the name : ");
		String name = sc.next();
		
		System.out.print("Enter the no of subjects : ");
		int subs = sc.nextInt();
		
		int[] marks = new int[10];
		float sum=0;
		
		for (int i=0; i<subs; i++) {
			System.out.print("Enter mark for subject "+ (i+1) + " : ");
			marks[i] = sc.nextInt();
			sum = sum+marks[i];
		}
		
		System.out.println();
		Student s = new Student(id, name, marks);
		
		float avg =  (sum/subs);

		s.calculateAvg(avg);
		
		s.findGrade();
		
		return s;
	}
	public static void main (String[] args) {
		
		Student s= getStudentDetails();
		
		System.out.println("Id :" + s.getId());
		System.out.println("Name :" + s.getName());
		System.out.println("Average :" + s.getAverage());
		System.out.println("Grade :" + s.getGrade());


	}
	
}