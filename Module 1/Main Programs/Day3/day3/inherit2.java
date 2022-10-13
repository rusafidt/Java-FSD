package day3;


class Member{
	String name;
	int age;
	String ph;
	String address;
	int salary;
	
	void printsalary() {
		System.out.println(salary);
	}
}

class Employee extends Member {
	String specialization;
}

class Manager extends Member{
	String department;
}


public class inherit2 {
	public static void main(String[] args) {
	Employee e = new Employee();
	e.name = "Rose ";
	e.age = 22;
	e.ph = "9562668979";
	e.address = "Vizhalil";
	e.salary = 1234;
	e.specialization = "Softaware Engineer";
	
	Manager m = new Manager();
	m.name = "Razal";
	m.age= 27;
	m.ph = "9562668979";
	m.address = "Theyyampattil";
	m.salary = 4321;
	m.department = "IT";
	
	System.out.println("Manager details : ");
	System.out.println("Name :" +m.name);
	System.out.println("Age :" +m.age);
	System.out.println("Salary :" +m.salary);
	System.out.println("Phone Number :" +m.ph);
	System.out.println();
	
	System.out.println("Employee details : ");
	System.out.println("Name :" +e.name);
	System.out.println("Age :" +e.age);
	System.out.println("Salary :" +e.salary);
	System.out.println("Phone Number :" +e.ph);
	System.out.println();
}
}