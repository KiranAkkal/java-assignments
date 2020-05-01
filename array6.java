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
		   	short[] shortarray;/*Declaration of the array*/
		   shortarray = new short[size];/*Creation of the array*/
           /*data insertion*/
		   shortarray[1] = 6;
		   shortarray[0] = 8;
		   shortarray[2] = 2;
           System.out.println(shortarray[0]);
           System.out.println(shortarray[1]);
           System.out.println(shortarray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		