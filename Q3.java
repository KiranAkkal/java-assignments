//program to print first 5 numbers which are not multiples of 4
class B
{
	public static void main(String[]args)
	{
		int count=1,n=1;
		while(count<=5)
		{
			if(n%4!=0)
			{
				System.out.println(n);
				count++;
			}
			n++;
		}
	}
}