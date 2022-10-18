package maven2;

public class person {

	private String name, gender;

	public person(String name, String gender, int age, int mobnumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.mobnumber = mobnumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMobnumber(int mobnumber) {
		this.mobnumber = mobnumber;
	}
	private int age, mobnumber;
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
		System.out.println("Mobile Number : " + mobnumber);
	}
	
	
}
