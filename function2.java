//write a function to find thefirst 10 even square numbers
class a
{
	public static void main(String[]args){ //calling function
	System.out.println("main starts");
		multiple();
		System.out.println("main ends");
	
		return;
	}
	public static void multiple(){//calling functiom
		int i=1,square,n=1;//initializing and declaring varibles
		while(i<=10){//to count for 10 numbers
			square=n*n;//formula to get the square of a number
			if(square%2==0){//checking wether the square number is even or not
				System.out.println(square);//if the number is even print that number
				i++;//counting the numbers and increasing
			}
            n++;//increasing numbers by unity 
		}
		return;//returning command to the calling function
	}

	}
