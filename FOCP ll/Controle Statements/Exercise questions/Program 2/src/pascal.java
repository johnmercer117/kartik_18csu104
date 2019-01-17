import java.util.*;
class pascal
{
	public static void main(String[] args)
	{
		char ch = 'A';
		for(int i=0;i<7;i++)
		{
			ch='A';
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(ch);
					ch++;
				}
				for(int k=(i-1);k>=0;k--)
				{
					ch--;
					System.out.print(ch);
				}
				System.out.print("\n");
			}
		}
	}
}