import java.io.*;
import java.util.*;
 class filedemo3
 {
 	public static void main(String[] args)
 	{
 		File f=null;
 		try{
 			f=new File("file.txt");
 			FileReader fin=new FileReader(f);
 			BufferedReader bin=new BufferedReader(fin);
 			String sr;
 			System.out.println("Contents of the string are:");
 			while((sr=bin.readLine())!=null)
 			{
 				System.out.println(sr);
 			}
 			bin.close();
 		}

 		catch (Exception e)
 		{
 			e.printStackTrace();
 		}
 	}
 }