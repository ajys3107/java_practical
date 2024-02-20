class SY2022bit034
{
	public static void main(String args[])
	{	
		int all_number;
		all_number=new_array();
		System.out.println("The Number of prime numbers: " + all_number);
		System.out.println("The Number of non-prime numbers: " + (1000-all_number));
	}
	
	public static boolean is_prime(long number)
	{
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				count++;
		}
		if(count==2)
		{
		
			return true;
		}
		else
		{
			return false;
		}	
		
	}
	public static int new_array()
	{       
		long[] arr=new long[1000];
		int i,a1,a2,a3,a4,a5,a6,a7,count=0;
		boolean valid;
		for(i=0;i<1000;i++)
		{
			
			a1=(int)System.nanoTime()%10;
			a2=(int)System.nanoTime()%10;
			a3=(int)System.nanoTime()%10;
			a4=(int)System.nanoTime()%10;
			a5=(int)System.nanoTime()%10;
			a6=(int)System.nanoTime()%10;
			a7=(int)System.nanoTime()%10;
			arr[i]=((a1*1000000)+(a2*100000)+(a3*10000)+(a4*1000)+(a5*100)+(a6*10)+a7);
		}
		for(i=0;i<1000;i++)
		{
			System.out.println(arr[i]);
			valid=is_prime(arr[i]);
			if(valid==true)
				count+=1;
		}
		return count;
	}
	
}
