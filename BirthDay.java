
public class BirthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday = "08/20/1973";
		String month = birthday.substring(0, 2);
		String day = birthday.substring(3, 5);
		String year = birthday.substring(6, 10);
		
		System.out.println("Birthday: " + birthday);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
		System.out.println("Year: " + year);
	}

}
