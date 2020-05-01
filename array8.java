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
		   	char[] chararray;/*Declaration of the array*/
		   chararray = new char[size];/*Creation of the array*/
           /*data insertion*/
		   chararray[1] = 'A';
		   chararray[0] = 'B';
		   chararray[2] = 'C';
           System.out.println(chararray[0]);
           System.out.println(chararray[1]);
           System.out.println(chararray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		