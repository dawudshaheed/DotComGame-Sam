public class investor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total = 1400;
		System.out.println( "Original investment = $" + 1400);
		
		// Original Investment increases in value by 40% the first year
		total = total + ( total * .4F);
		System.out.println( "AFter one year: $" + total );
		
		//Original Investment lost $1500 in value the second year
		total = total  - 1500;
		System.out.println("After second year $" + total );
		
		//Original Investment increased in value by 12% the third year
		total = total + (total * .12F);
		System.out.println("After third year; $" + total);
		
	}

}
