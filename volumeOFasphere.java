class A{
	public static void main(String[]args){
		System.out.println("main starts");
		double volume;
		volume=volumeofsphere();
		volumeofsphere();
		System.out.println(volume);
		System.out.println("main ends");
		return;
	}
	public static double volumeofsphere(){
		System.out.println("area starts");
		double radius=10, volumeofsphere;
		volumeofsphere=(4/3)*3.142*radius*radius*radius;
		return volumeofsphere;
	}

}
/* TRACING
main starts
calling the function volumeofsphere
volume = 4189.333
returns the value of volume to main function
4189.333
main ends

