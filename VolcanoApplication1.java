
public class VolcanoApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolcanoRobot dante = new VolcanoRobot ();
		dante.status = "exploring";
		dante.speed = 2;
		dante.temperature = 510;
		
		dante.showAttributes();
		System.out.println("increasing speed to 3.");
		dante.speed = 3;
		dante.showAttributes();
		System.out.println("Changing temperature to 670.");
		dante.temperature = 670;
		dante.showAttributes();
		System.out.println("Checking the temperature.");
		dante.checkTemperature();
		dante.showAttributes();
	}

}
	
	
/*public class constructorExample {
public static void main(String arg[])
check first=new check(1,2);
check second=new check(3,4);
check third=new check(5,6);
check fourth=new check(7,8);

check fifth=new check(9,10);
System.out.println("Number of objects = "+first.count);	
System.out.println("Number of objects = "+second.count);	
System.out.println("Number of objects = "+third.count);	

System.out.println("Variabe of first object "+first.x+" "+first.y);	
System.out.println("Variabe of second object "+second.x+" "+second.y);	
System.out.println("Variabe of third object "+third.x+" "+third.y);	

System.out.println("Variabe of fifth object "+fifth.x+" "+fifth.y);	


} 
}*/