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
		   	int[] integerArray;/*Declaration of the array*/
		   integerArray = new int[size];/*Creation of the array*/
           /*data insertion*/
		   integerArray[1] = 10;
		   integerArray[0] = 20;
		   integerArray[2] = 30;
           System.out.println(integerArray[0]);
           System.out.println(integerArray[1]);
           System.out.println(integerArray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		