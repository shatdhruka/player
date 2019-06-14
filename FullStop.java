import java.util.*;
import java.lang.*;
import java.io.*;

public class FullStop
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String z=sc.nextLine();
		StringBuilder m= new StringBuilder(z);
		System.out.println(m.append("."));
	}
}
