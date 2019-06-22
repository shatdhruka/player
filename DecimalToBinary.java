import java.util.Scanner;
import java.io.*;

public class DecimalToBinary 
{
    public static void DecimalToBinary(int z)
    {
        System.out.println(Integer.toBinaryString(z));
    }
	public static void main (String[] args) 
	{
	    DecimalToBinary x=new DecimalToBinary();
	    Scanner sc=new Scanner(System.in);
	    int z=sc.nextInt();
        x.DecimalToBinary(z);
	}
}
