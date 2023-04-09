import java.util.*;

public class Main
{    public static void sort01(int arr[])
     {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            if(left==1 || right==0)
            {
                int t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                
            }
            left++;
             right--;
        }
        for(int i=0;i<n;i++)
		{
		   System.out.println(arr[i]);
		}
         
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
            sort01(arr);
	
	}
}

