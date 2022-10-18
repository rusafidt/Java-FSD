
import java.util.Scanner;

class student {
	protected int studentId, departmentId;
	protected String gender, name, phone;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

class Hosteller extends student {
	
	
	private String hostelName;
	private int roomNumber;
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
	
}

public class hosteldetails{
	
	public static Hosteller getHostellerDetails() {
		System.out.println("Enter the Details  ");
		
		Hosteller host = new Hosteller ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nStudent ID : ");
		int stud_id = sc.nextInt();
		host.setStudentId(stud_id);
		
		System.out.print("Student Name : ");
		String name = sc.next();
		host.setName(name);
		
		System.out.print("Department ID : ");
		int dep_id = sc.nextInt();
		host.setDepartmentId(dep_id);
		
		System.out.print("Gender : ");
		String gender = sc.next();
		host.setGender(gender);
		
		System.out.print("Phone Number : ");
		String ph_no = sc.next();
		host.setPhone(ph_no);
		
		System.out.print("Hostel Name : ");
		String hostel_name = sc.next();
		host.setHostelName(hostel_name);
		
		System.out.print("Room Number : ");
		int room_no = sc.nextInt();
		
		System.out.print("Modify Room Number(Y/N) ");
		char modif = sc.next().charAt(0);
		
		if ((modif == 'Y') || (modif == 'y')) {
			System.out.print("New Room Number : ");
			int room_no1 = sc.nextInt();
			room_no = room_no1;
			host.setRoomNumber(room_no);

		}
		
		System.out.print("Modify Phone Number(Y/N) ");
		char modif1 = sc.next().charAt(0);
		
		if ((modif1 == 'Y') || (modif1=='y')) {
			System.out.print("New Phone Number : ");
			String ph_no1 = sc.next();
			ph_no = ph_no1;
			host.setPhone(ph_no);

		}
		
		System.out.println("\nThe Student Details : ");
		System.out.println("\n"+host.getStudentId() + " " + host.getName() + " " + host.getDepartmentId()
		+ " " + host.getGender() + " " + host.getPhone() + " " + host.getHostelName());
		return null;
	}
	
	public static void main (String[] args) {
		
		getHostellerDetails();
		
	}
	
}