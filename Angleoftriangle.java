import java.util.*;
public class Angleoftriangle
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a!=0 && b!=0 && c!=0 && (a+b+c==180) )
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
