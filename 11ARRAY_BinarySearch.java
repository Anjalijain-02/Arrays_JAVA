import java.util.*;

public class Main
{    public static int binarysearch(int arr[],int s)
     {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
           int mid=(left+right)/2;
           if(arr[mid]<s)
           {
               right=mid-1;
           }
           else if(s<arr[mid])
           {
               left=mid-1;
           }
           else{
               return mid;
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
		System.out.println("enter element to be searched");
		int s=sc.nextInt();
		
            int t=binarysearch(arr,s);
	        System.out.println("found at "+ t);
	}
}

