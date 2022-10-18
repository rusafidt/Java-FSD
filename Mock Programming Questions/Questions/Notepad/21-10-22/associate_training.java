import java.util.Scanner;

class Associate {
	
	private int associateid;
	public Associate(int associateid, String associateName) {
		super();
		this.associateid = associateid;
		this.associateName = associateName;
	}
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	private String workStatus, associateName;
	
	public String trackAssociateStatus(int noofdays) {
		
		if (noofdays>60) {
			workStatus = "Deployed in Project";
		}
		else {
			workStatus = "Still training";

		}
		return workStatus;
	}
}

public class associate_training{
	
	public static void main (String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("      Associate Details     ");
		System.out.println();
		
		System.out.print("Enter the associate id : ");
		int num = sc.nextInt();
		
		System.out.print("Enter the associate name : ");
		String name = sc.next();
		
		System.out.print("Enter the number of days : ");
		int days = sc.nextInt();
		
		
		Associate a = new Associate(num, name);
		
		System.out.println("The associate " + a.getAssociateName() + " work status : " + a.trackAssociateStatus(days));
	}
}