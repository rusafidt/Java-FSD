import java.util.Scanner;

class Candidate {
	private String name,gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	private double expectedSalary;
	
	
}

 class main2 {
	 public static Candidate getCandidateDetails() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Name : ");
		 String name = sc.next();
		 
		 System.out.print("Gender : ");
		 String gender = sc.next();
		 
		 System.out.print("Expected Salary : ");
		 double salary = sc.nextDouble();
		 Candidate obj = new Candidate();
		 
		 if (salary>10000) {
			 throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000");
			 
		 }
		 
		 else {
			 obj.setName(name);
			 obj.setGender(gender);
			 return obj;
		 }
	 }
	 	public static void main(String[] args) {
	 		try {
	 			Candidate obj = getCandidateDetails();
	 			System.out.println("Registration Successful");
	 		} catch (InvalidSalaryException e) {
	 			System.out.println(e.getMessage());
	 		}
	 
 }
 }
 
class InvalidSalaryexception extends Exception {
	public InvalidSalaryexception Exception(String message) {
		super(message);

		
	}

}
