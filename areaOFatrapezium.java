//Design a function to return the area of trapezium and print it in main function. 
class A{
	public static void main(String args[]){
	int area;// declaration
	area=trapezium();// calling the function
	System.out.println(area);// printing the area
	return;// returning control to jvm
	}
	public static int trapezium(){
	int a=2;//declaration and initialization
	int b=3;//
	int h=4;//
	int l=(a+b);//declaration
	int i=l*h;//
	int area=i/2;//
	return area;// returnig the value of area to the main function
	}
}

/*TRACING
redirecting from main to called function named as trapezium
l=5
i=20
area 10
return 10 to main 
printed 10*/