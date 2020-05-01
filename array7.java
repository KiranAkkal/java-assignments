class A
{
	public static void main(String[] args)
	      {
		System.out.println("main starts.......");
		 array(3);
		 System.out.println("main ends");
		  }
		   public static void array(int size)
		   {
		   	boolean[] booleanarray;/*Declaration of the array*/
		   booleanarray = new boolean[size];/*Creation of the array*/
           /*data insertion*/
		   booleanarray[1] = true;
		   booleanarray[0] = false;
		   booleanarray[2] = true;
           System.out.println(booleanarray[0]);
           System.out.println(booleanarray[1]);
           System.out.println(booleanarray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		