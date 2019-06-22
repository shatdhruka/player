import java.util.Scanner;
import java.io.*;

public class BinaryToDecimal 
{
    public static void Bintodec(String z)
    {
        int decimal=Integer.parseInt(z,2);
        System.out.println(decimal);
    }
	public static void main (String[] args) 
	{
	    BinaryToDecimal x=new BinaryToDecimal();
	    Scanner sc=new Scanner(System.in);
	    String z=sc.nextLine();
        x.Bintodec(z);
	}
}
