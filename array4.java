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
		   	byte[] byteArray;/*Declaration of the array*/
		   byteArray = new byte[size];/*Creation of the array*/
           /*data insertion*/
		   byteArray[1] = 1;
		   byteArray[0] = 2;
		   byteArray[2] = 2;
           System.out.println(byteArray[0]);
           System.out.println(byteArray[1]);
           System.out.println(byteArray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		