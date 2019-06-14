import java.util.*;

public class Angleoftriangle
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x!=0 && y!=0 && z!=0 && (x+y+z==180) )
            {
            	System.out.println("yes");
            }
            else
            {
            	System.out.println("no");
            }
    	}
}
