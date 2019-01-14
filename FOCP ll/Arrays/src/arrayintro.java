import java.util.*;
class arrayintro
{
	public static void main(String[] args)
	{
	Scanner z = new Scanner(System.in);
	int [] arr = new int[10];
	System.out.println("Enter 10 values in array");
	for(int x=0;x<arr.length;x++)
	 {
      arr[x]=z.nextInt(); 
	 }
	System.out.println("Enter value to be searched");
    int searchval = z.nextInt();
    int index=-1;
    for(int x=0;x<arr.length;x++)
     {
    	System.out.print(arr[x]);
    	if(searchval==arr[x])
        {
    		System.out.print(searchval);
    		index = x;
    		System.out.print(index);
        }
    	
     } 
     System.out.println("index of the given number is-" +index);
    }
}
 