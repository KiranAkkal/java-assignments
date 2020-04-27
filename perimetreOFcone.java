//Design a function to return the perimeter of cone and print it in main function.
class A{
	public static void main(String args[]){
	double area;//declaration 
	area=cone();//calling function
	System.out.println(area);//printing area
	return;//retuning control to jvm
}public static double cone(){
	int r=2;//declaring and initializing
	int h=6;//declaring and initializing
	double b=h*r*r*3.14;//declaring and utilization
	double area=b/3;//declaring and utilization
	return area;//value is returning to calling function
	}
}
/* TRACING 
 area=cone()
 r=2
 h=6
 area= value
 return value to main 
 print value
 return to jvm*/