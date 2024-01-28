public class SY2022bit034{
	public static void main(String args[])
	{
		int a[]={11,22,33,44,55};
		task1(a);
		
		task2(a);
		task3(a);
		task4(a);
		
		
			
	}
	public static void task1(int [] arr)
	{       
		System.out.println (arr[0]);
	}
	public static void task2(int [] arr)
	{
		System.out.println (arr[4]); 
	}
	public static void task3(int [] arr)
	{
		System.out.println (arr[3]);
	}
	public static void task4(int [] arr)
	{       int i;
	        int sum=0;
		for(i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
}
