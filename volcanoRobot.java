class  VolcanoRobot {
	     String status;
	     int speed;
	     float temperature;
	     
	     void checkTemperature() {
	             if (temperature > 660) {
	                 status = "returning home";
	                 speed = 5;
	             }
         }
	     
	     void showAttributes () {
	    	 System.out.println("Status: " + status);
	    	 System.out.println("Speed: " + speed );
	    	 System.out.println("Temperature: " + temperature);
	     }
}

/*public class VolcanoRobot {
String status;
int speed;
float temperature;

VolcanoRobot(String st, int sp,float tp){
    status=st;
    speed=sp;
    temperature=tp;
}

public class VolcanoApplication {

public static void main(String[] args) {
//we're building robots
    VolcanoRobot dante = new VolcanoRobot ("exploring", 3, 510);
//  dante.status = "exploring";
//  dante.speed = 2;
//  dante.temperature = 510;
   
    dante.showAttributes();
    System.out.println("Increasing speed to 3.");
//  dante.speed = 3;
    dante.showAttributes();
    System.out.println("Changing temperature to 670.");
    dante.temperature = 670;
    dante.showAttributes();
    System.out.println("Checking the temperature.");
    dante.checkTemperature();
    dante.showAttributes();

//VolcanoRobot virgil = new VolcanoRobot ();
//virgil.status = "exploring";
//virgil.speed = 2;
//virgil.temperature = 510;

//virgil.showAttributes();
//System.out.println("Increasing speed to 3.");
//virgil.speed = 3;
//virgil.showAttributes();
//System.out.println("Changing temperature to 670.");
//virgil.temperature = 670;
//virgil.showAttributes();
//System.out.println("Checking the temperature.");
//virgil.checkTemperature();
//virgil.showAttributes();*/
