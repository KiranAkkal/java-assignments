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
		   	long[] longarray;/*Declaration of the array*/
		   longarray = new long[size];/*Creation of the array*/
           /*data insertion*/
		   longarray[1] = 1432;
		   longarray[0] = 2345;
		   longarray[2] = 2424;
           System.out.println(longarray[0]);
           System.out.println(longarray[1]);
           System.out.println(longarray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		