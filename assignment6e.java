//Design a function to return the peremeter of cone to calling function by taking the required inputs from calling menthod and print the result in a dedicated printvalue function. 
class A{
	public static void main(String args[]){
	double perimeter;//declaration 
	perimeter=cone(2,6);//calling function
	
	return;//returning control to jvm
}public static double cone(int r,int h){
	double b=h*r*r*3.14;//declaring and utilization
	double perimeter=b/3;//declaring and utilization
	return perimeter;//value is returning to calling function
	}
	public static void print(double perimeter) {
		System.out.println(perimeter);
	}
}
/* TRACING 
 perimeter=cone(2,6)
 perimeter= value
 return value to main
 hands over control to print function 
 print value
 return to jvm*/