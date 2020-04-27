//design a function to return the area of square and print it in main function.

class A{
	public static void main(String args[]){
        int area; // initialization 
        area=square(); // calling the square fuction and fetching area from other function
        System.out.println(area);// printing the area
       return;// returning control to jvm
	}
	public static int square(){
		int s=2;// initializing 
		int area=s*s;
		return area;// returning the value of area to main function
	}
}


/* TRACING 
 area=square()
 s=2
 area= 2*2
 area=4
 return 4 to main function
 return to jvm*/