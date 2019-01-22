 import java.util.*;
class arraycheck
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int [] arr = new int[5];
		int input,j ;
		boolean duplicate= false;
		System.out.println("Enter values between 10 and 100:");

		for(int x=0;x<arr.length;x++)
		{
			input=z.nextInt();

			for ( j=0;j<x;j++) 
			{
				if(input==arr[j])
				{
					duplicate=true;
				}
			}

			if(!duplicate)
			{
				arr[x]=input;
				System.out.println("array:");
				System.out.println(arr[j]);
			}


		}
		
	}
}