import java.util.*;

public class Main
{    public static int findduplicate(int arr[],int n)
     {
         for(int i=0;i<n-1;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                 if(arr[i]==arr[j])
                 {
                     return arr[i];
                 }
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
	int c= findduplicate(arr,n);
		System.out.println("duplicate value is "+c);
	}
}

