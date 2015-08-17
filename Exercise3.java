
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] valA = {13, -22, 82, 17}; 
		int[] valB = {-12, 24, 79, 13}; 
		int[] sum = {0, 0, 0, 0};
		
		//add values from corresponding cells of valA and valB
		//put the result in the corresponding cell of sum
		
		sum[0] = valA [13] + valB[-12];
		sum[1] = valA[-22] + valB[24];
		sum[2] = valA[82] + valB[79];
		sum[3] = valA[17] + valB[13];
		
	/*	This is the correct input:
	  	sum[0] = valA [0] + valB[0];  
		sum[1] = valA[1] + valB[1];
		sum[2] = valA[2] + valB[2];
		sum[3] = valA[3] + valB[3]; */
		
		System.out.println("sum: " + sum[0] + "" + sum[1] + "" + sum[2] + "" + sum [3] );
	}

}
 