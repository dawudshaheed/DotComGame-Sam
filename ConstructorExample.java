public class constructorExample {
public static void main(String arg[]){
	
	
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
}

