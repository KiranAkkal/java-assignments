//[a->] Design a function to return the area of square and print it in main function by taking the required inputs from calling menthod. 

class A{
	public static void main(String args[]){
        int area; // initialization 
        area=square(2); // calling the square fuction and fetching area from other function and transfering input to called function 
        System.out.println(area);// printing the area
       return;// returning control to jvm
	}
	public static int square(int s){
		int area=s*s;
		return area;// returning the value of area to main function
	}
}


/* TRACING 
 area=square(2)
 providing input 2 via calling method
 area= 2*2
 area=4
 return 4 to main function
 return to jvm*/