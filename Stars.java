public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			final int  MAX_ROWS= 15;
			System.out.println("stars");
			
			for (int row = 1; row <= MAX_ROWS; row++)
			{
				
				for (int stars = 1; stars <= row; stars++){
					System.out.print("*");
				}
				System.out.println();
			
		    }

	}

}
