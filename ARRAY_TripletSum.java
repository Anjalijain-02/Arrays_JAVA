import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		    
		}
		System.out.println("enter sum");
		int x= sc.nextInt();
			for(int i=0;i<n;i++)
			{
			    for(int j=i+1;j<n;j++)
			    {
			        for(int k=j+1;k<n;k++)
			        {
			       if( arr[i]+arr[j]+arr[k] == x)
			       {
			           c++;
			       }
			        }
			    }
			}
			System.out.println(c);
	}
}
