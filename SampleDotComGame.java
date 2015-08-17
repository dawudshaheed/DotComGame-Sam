import java.util.Scanner.*;
public class SampleDotComGame {
		public static void main (Strings[] args) {
			Scanner scanner = new Scanner (System.in);
			int hit = 0;
			int guess = 0;
			hit++;
			guess++;
			System.out.println("Make a guess.");
			Scanner input;
			guess = input.nextInt();
			System.out.println("Your guess was: " + guess);
		//int [][] sam = new int [7][7];
		//locationCells = new int[3] ;
		//int[] greens = {20, 30, 40};
		greens (20);
		greens (30);
		greens (40);
		//int[] blues = {12,13,14};
		blues  (12);
		blues  (13);
		blues  (14);
		//int[] oranges = {63, 64, 65};
		oranges (63);
		oranges (64);
		oranges (65);}
		//int [] locationCells;
		//int numofHits =0;
	private static void oranges(int ships) {
		switch (ships) {
			case 63:
				System.out.println("Hit");
				break;
			case 64:
				System.out.println("Hit");
				break;
			case 65:
				System.out.println("Hit");
				break;
			default:
				System.out.println("Miss");	
		}				
		}
	private static void blues(int ships) {
		switch (ships) {
			case 12:
				System.out.println("Hit");
				break;
			case 13:
				System.out.println("Hit");
				break;
			case 14:
				System.out.println("Hit");
				break;
			default:
				System.out.println("Miss");
		}
	}
				
		
	private static void greens (int ships){
		switch (ships) {
			case 20:	
				System.out.println("Hit");
				break;
			case 30:
				System.out.println("Hit");
				break;
			case 40:
				System.out.println("Hit");
				break;
			default:
				System.out.println("Miss");
		}
	}


			if (ships==20 && ships==30 && ships==40);{
				System.out.println("You sunk Greens.com");
				hit++; }
			if (ships==63 && ships==64 && ships==65);{
				System.out.println("You sunk Oranges.com");
				hit++; }
			if (ships==12 && ships==13 && ships==14);{
				System.out.println("You sunk Blues.com");
				hit++; }
			if(ships==12 && ships==13 && ships==14 && ships==63 && ships==64 && ships==65 &&
					ships==20 && ships==30 && ships==40){		
					System.out.println("GAME OVER!!! You have killed all .com's, Good Job!!!");
					System.out.println("You have a USER RATING: " + hit++ + " Guesses");
			}
	}
					
				
				
	/*class dotCom {
	int[][] Grid = new int [7][7]; //Grid array not used at this point
	static int Go2[] = new int[3]; 
	static int Pets[] = new int[3];
	static int AskMe[] = new int[3];

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int hit=0;
		
		int guess = 0;
		// Set scanner for key Board and initialize
		
		String contYorN = "Y"; 
		
		int h = 1;           // Feedback counter
				
		while (contYorN.equalsIgnoreCase("y") && hit<9){ // contYorN only used for logic in while loop

			System.out.println("Enter Guess?");
			guess = input.nextInt();
								
			System.out.println("Your Guess Was: " + guess);
			System.out.println(h);
			
			
		h++;
			
									
			if(guess == 10 || guess == 20 || guess == 30   // B0, C0, D0 = Go2
			|| guess == 31 || guess == 32 || guess == 33   // D1, D2, D3 = Pets
			|| guess == 63 || guess == 64 || guess == 65) { // G3, G4, G5 = AskMe
						System.out.println("Hit!");

			} else {
				System.out.println("Miss!");										
				
			}

	// Input guesses from keyboard and give the user: a guess and 'status hit or miss'
	// Also, counts the # of attempts for feedback.

	//-----------------------------------------------------------------Go2
			
			if(guess == 10)	{
				
			Go2[0] = 10;
			hit++;
			
			}			
			if(guess == 20){
				
			Go2[1] = 20;
			hit++;
						
			}
		
			if(guess == 30){
			Go2[2] = 30;
			hit++;
			
			}
			
			if(Go2[0]==10 && Go2[1]==20 && Go2[2]==30){
			System.out.println("You sunk Go2.com!");	
		
			}
			
	//--------------------------------------------------------------------Pets
			
			if(guess == 31){
				
			Pets[0] = 31;
			hit++;
		
			}		
			if(guess == 32){
			
			Pets[1] = 32;
			hit++;
		
		
			}

			if(guess == 33){
			Pets[2] = 33;
			hit++;
		}

			if(Pets[0]==31 && Pets[1]==32 && Pets[2]==33){
			System.out.println("You sunk Pets.com!");
			
		}
			
	//-----------------------------------------------------------------AskMe	
					
			if(guess == 63){			
			AskMe[0] = 63;
			hit++;

		}			
			if(guess == 64){		
			AskMe[1] = 64;
			hit++;
			

		}

			if(guess == 65){
			AskMe[2] = 65;
			hit++;
		}
		
			if(AskMe[0]==63 && AskMe[1]==64 && AskMe[2]==65){
			System.out.println("You sunk AskMe.com!");

			h++;}		
		
		}
		

			if(Go2[0]==10 && Go2[1]==20 && Go2[2]==30 && Pets[0]==31 && Pets[1]==32 && Pets[2]==33 &&
				AskMe[0]==63 && AskMe[1]==64 && AskMe[2]==65){		
				{System.out.println("Game over all .com's killed!");
				System.out.println("User Rating:" + h++ + "Guesses");
				
			}
		}		
	}
	}

	// Logic part is working somewhat, more work is needed.
		

	*/		



	 

}
