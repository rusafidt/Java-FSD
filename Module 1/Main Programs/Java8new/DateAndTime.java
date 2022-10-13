
public class DateAndTime {

	public static void main(String[] args) {
		System.out.println("Current Local Date : " + java.time.LocalDate.now()); //API to get local date
		
		System.out.println("\n Current Local Time : " + java.time.LocalTime.now()); //API to get local time

		System.out.println("\n Current Local Date and Time : " + java.time.LocalDateTime.now()); //API to get local date and time

	}

}
