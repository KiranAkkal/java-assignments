class A
{ 
    public static void main(String[] args) 
    { 
        reversestring();
    }
    public static void reversestring() {
    	 String input = "HELLO"; 
  
        // convert String to character array 
        // by using toCharArray 
        char[] k = input.toCharArray(); 
  
        for (int i = k.length-1; i>=0; i--) 
            System.out.print(k[i]);
     	
     } 
} 