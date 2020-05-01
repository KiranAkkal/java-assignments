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
		   	float[] floatArray;/*Declaration of the array*/
		   floatArray = new float[size];/*Creation of the array*/
           /*data insertion*/
		   floatArray[1] = 0.3f;
		   floatArray[0] = 0.3f;
		   floatArray[2] = 0.3f;
           System.out.println(floatArray[0]);
           System.out.println(floatArray[1]);
           System.out.println(floatArray[2]);
		System.out.println("main ends.......");
        return;
           }
}
		   	
	
		