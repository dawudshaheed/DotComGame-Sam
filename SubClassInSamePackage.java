
public class SubClassInSamePackage extends BaseClass {

	public static void main(String[] args) {
		BaseClass rr = new BaseClass();
		rr.z = 0;
		SubClassInSamePackage subClassObj = new SubClassInSamePackage();
		System.out.println("Value of x is: " + subClassObj.x);
		subClassObj.setX(20);
		System.out.println("Value of x is: " + subClassObj.x);
		System.out.println("Value of Z is: " + subClassObj.z);
		subClassObj.setZ(30);
		System.out.println("Value of z is: " + subClassObj.z);
		System.out.println("Value of x is: " + subClassObj.a);
		subClassObj.setA(20);
		System.out.println("Value of x is: " + subClassObj.a);

	}

}
