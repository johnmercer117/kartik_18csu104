import java.util.*;
class arraycheck
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter values between 10 and 100:");
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=z.nextInt();
		}
		for(int x=0;x<arr.length;x++)
		{
            for(int y=1;y<arr.length;y++)
            {
            	if(arr[x]!=arr[y])
            	{
            		System.out.println("Entered values are-");
            		System.out.println(arr[x]);
            	}
            	else
            	{
            		System.out.println("Repeation not allowed ");
            	}
            }
		}
	}
}