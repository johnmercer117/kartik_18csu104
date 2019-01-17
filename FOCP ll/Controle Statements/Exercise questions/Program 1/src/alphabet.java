import java.util.*;
class alphabet
{
	public static void main(String[] args)
	{
		Scanner z = new Scanner(System.in);
		System.out.println("Enter any charecter:");
		char ch = z.next().charAt(0);

		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		{
			System.out.println("Entered charecter is a vowel!!");
		}
		else
		{
		    System.out.println("Entered charecter is a consonant!!");	
		}
	}
} 
