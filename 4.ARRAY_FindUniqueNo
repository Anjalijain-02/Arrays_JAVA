import java.util.*;

public class Main
{    public static int findunique(int arr[])
     {
         
        for(int i=0;i<arr.length;i++)
        {
            int j;
            for(j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        break;
                    }
                }
            }
            if(j==arr.length)
            {
                return arr[i];
            }
        }
         return -1;
         
     }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter size of array");
	    int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
	int c= findunique(arr);
		System.out.println("unique vale is "+c);
	}
}

