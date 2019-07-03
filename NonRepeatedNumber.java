import java.util.*;
import java.lang.*;
import java.io.*;
public class NonRepeatedNumber 
{
    public static void nonrepeatandsort(int a[],int n)
    {
        int temp =0;
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int count=0;
        for(int j=0;j<n;j++) 
        {
            for(int k =0 ;k<n;k++) 
            {
                if(a[j] == a[k]) 
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(a[j]);
            }
            count = 0;
        }
    }
	public static void main (String[] args) 
	{
		NonRepeatedNumber z=new NonRepeatedNumber();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		z.nonrepeatandsort(a,n);
	}
}
