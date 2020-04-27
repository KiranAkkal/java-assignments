/* area of a cylinder */
class a{
	public static void main(String[]args){
		System.out.println("main starts");
		double area;
		area=areaofcylinder();
		areaofcylinder();
		System.out.println(area);
		System.out.println("main ends");
		return;
	}
	public static double areaofcylinder(){
		System.out.println("area starts");
		double height=3,radius=5, areaofcylinder;
		areaofcylinder=(2*3.142*radius*height)+(2*3.142*radius*radius);
		return areaofcylinder;
	}

}
/* Tracing
main starts
calling function named areaof cylinder
area starts
area=(2*3.142*5*3)+(2*3.132*5*5)
*/
