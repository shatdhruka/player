import java.util.*;
public class Camel_Case
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    while(sc.hasNext())
	    {
        String z=sc.next();
        String outputval;
        Camel x=new Camel();
        System.out.print(x.CamelCase(z)+ " ");
	    }
	}
}
class Camel
{
	String CamelCase (String inputVal)
	{
        return inputVal.substring(0,1).toUpperCase()+ inputVal.substring(1);
    }
}
