/* Design a function to return the surfacearea of cylinder and print it in main function by taking the required inputs from calling menthod. 
 */
class A{
	public static void main(String[]args){
		System.out.println("main starts");
		double area;
		area=areaofcylinder(3,5);//calling the function areaofcylinder and transfering data to it
		System.out.println(area);
		System.out.println("main ends");
		return;
	}
	public static double areaofcylinder(double height,double radius)//receiving data from main function and initializing and decalaring 
	{
		System.out.println("area starts");
		double areaofcylinder;
		areaofcylinder=(2*3.142*radius*height)+(2*3.142*radius*radius);
		return areaofcylinder;
	}

}
/* Tracing
main starts
calling function named areaof cylinder and transfering data
data received
area starts
area=(2*3.142*5*3)+(2*3.132*5*5)
returns area to main function
prints 251.35
main ends



*/
