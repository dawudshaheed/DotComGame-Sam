
public class Birthday2 {
	public static void main(String[] args) {
		String str = "My Birthday is 08/20/1973";
		System.out.println("Birthday format: " + "MM/DD/YY");
		System.out.println("My birthday is " + str.substring(16, 25));
		System.out.println("Birthday: " + str.substring(16, 25));
		System.out.println("Month: " + str.substring(15, 17));
		System.out.println("Day: " + str.substring(18, 20));
		System.out.println("Year: " + str.substring(21, 25));
	}
}
