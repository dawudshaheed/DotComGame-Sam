import java.util.Scanner;

public class DotComGame {
	
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

		private static void main (String[] args) {
			Scanner input = new Scanner (System.in);
			int hit = 0;
			int guess = 0;
			hit++;
			guess++;
			System.out.println("Make a guess.");
		//Scanner input;
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
		oranges (65);
		//int [] locationCells;
		//int numofHits =0;
		
		}
		public static void ships () {
		int ships;
			ships = 12;
			ships = 13;
			ships = 14;
			ships = 20;
			ships = 30;
			ships = 40;
			ships = 63;
			ships = 64;
			ships = 65;
		if (ships==20 && ships==30 && ships==40);{
			System.out.println("You sunk Greens.com");
			hit++; 	}
		if (ships==63 && ships==64 && ships==65);{
			System.out.println("You sunk Oranges.com");
			hit++;  }
		if (ships==12 && ships==13 && ships==14);{
			System.out.println("You sunk Blues.com");
			hit++;  }
		if(ships==12 && ships==13 && ships==14 && ships==63 && ships==64 && ships==65 &&
				ships==20 && ships==30 && ships==40){		
				System.out.println("GAME OVER!!! You have killed all .com's, Good Job!!!");
				System.out.println("You have a USER RATING: " + hit++ + " Guesses!!!");
		
}
		}
}
		
			
 