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
		   	double[] doubleArray;/*Declaration of the array*/
		   doubleArray = new double[size];/*Creation of the array*/
           /*data insertion*/
		   doubleArray[1] = 10.32;
		   doubleArray[0] = 20.31;
		   doubleArray[2] = 30.43;
           System.out.println(doubleArray[0]);
           System.out.println(doubleArray[1]);
           System.out.println(doubleArray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		