//Design a function to find the area of trapizium and print it in main function by taking the required inputs from calling menthod and print the result in a dedicated printvalue function.
class A{
	public static void main(String args[]){
	int area;// declaration
	area=trapezium(2,3,4);// calling and transfering data to the function trapezium
	print(area);//calling and transfering data to the function print
	return;// returning control to jvm
	}
	public static int trapezium(int a,int b,int h)//receiving data from main function  and saving it to variables
	{
	int l=(a+b);//declaration
	int i=l*h;//
	int area=i/2;//
	return area;// returnig the value of area to the main function
	}
	public static void print(int area)//receiving data from main function  and saving it to a variable
	 {
		System.out.println(area);
		
	}

}

/*TRACING
redirecting from main to called function named as trapezium
p
area 10
return 10 to main 
handing control to function print
printed 10*/