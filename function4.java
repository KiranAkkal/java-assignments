//4]write a function to find the odd cube numbers between 1 and 50?
class A{
	public static void main (String args[]){
	System.out.println("main starts");
	cub();
	System.out.println("main end");
	return;
	}
	public static void cub(){
	System.out.println("function start");
	int n;
	for(n=0;n<=10;n++){
		if(n%2==0 && n==(n*n*n/2)){
	System.out.println(n);
	System.out.println("function end");
	return;
	}
	}
	}
}