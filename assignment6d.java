//Design a function to the volume of sphere and print it in main function by taking the required inputs from calling menthod and also print the result in a dedicated printvalue function.
class A{
	public static void main(String[]args){
		System.out.println("main starts");
		double volume;
		volume=volumeofsphere(10);//calling and tranfering data to function volume of sphere
		print(volume);//handing control to print function
		System.out.println("main ends");
		return;
	}
	public static double volumeofsphere(double radius)
	{
		System.out.println("area starts");
		double volumeofsphere;
		volumeofsphere=(4/3)*3.142*radius*radius*radius;
		return volumeofsphere;
	}
	public static void print(double volume) {
		System.out.println(volume);
		
	}

}
/* TRACING
main starts
calling the function volumeofsphere
volume = 4189.333
returns the value of volume to main function
hands over control to print function
prints 4189.333
*/

