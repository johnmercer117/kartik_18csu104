import java.util.*;
class mergearray
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		int [] arr1 = new int[50];
		int [] arr2 = new int[50];
		int [] arr3 = new int[100];
		System.out.println("Enter size of first array:");
		int size1=z.nextInt();
		System.out.println("Enter elements of first array:");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=z.nextInt();
		}

		System.out.println("Enter size of second array:");
		int size2=z.nextInt();
		System.out.println("Enter elements of second array:");
		for(int j=0;j<size2;j++)
		{
			arr2[j]=z.nextInt();
		}

		System.out.println("Merging arrays.......");
		for(int i=0;i<size1;i++)
		{
			arr3[i]=arr1[i];
		}
		for(int j=0;j<size2;j++)
		{
			arr3[j+size1]=arr2[j];
		}
		int size3=size1+size2;
		System.out.println("Merged  array is:");
		for(int i=0;i<size3;i++)
		{
			System.out.print(" " +arr3[i]);
		}
        System.out.println("\n");
		for(int i=0;i<size3;i++)
		{
			for(int j=i+1;j<size3;j++)
			{
				if(arr3[i]>arr3[j])
				{
					int temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
			}
		}
		System.out.println("Sorted and Merged array is:");
		for(int i=0;i<size3;i++)
		{
			System.out.print(" " +arr3[i]);
		}
	}
}