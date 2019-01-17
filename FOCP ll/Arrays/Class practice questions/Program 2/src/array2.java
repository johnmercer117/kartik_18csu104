import java.util.*;
class array2
{
	public static int findindex(int [] arr)
	{   Scanner m = new Scanner(System.in);
        System.out.println("Enter values to be searched:");
		int num=m.nextInt();
		int index=-1;
		for(int x =0;x<5;x++)
		{
			if(num==arr[x])
			{
				index=x;
			}
		}
		return index;
	}
	public static void main(String[] srgs)
	{
		array2 var = new array2();
		Scanner z=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter elements in the array;");
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=z.nextInt();
		}
		
		int index = var.findindex(arr);
		System.out.println("Index of the entered element is" +index);

	}
}