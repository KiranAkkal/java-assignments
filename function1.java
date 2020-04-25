// Function assignment 1


class A
{

  public static void main(String[] args) 
  {
      oddsum();
        return;
  }

      public static void oddsum(){
            int count = 1;
    int sum = 0;
    int i=1;

    while (count <= 10)
      {
   if (i%3==0 && i%2!=0)
    {
      sum = sum + i;
      System.out.println (sum);
      

    }
    i++;
  count++;

      }

    return;
    }
}
