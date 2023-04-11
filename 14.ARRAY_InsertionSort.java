import java.util.*;

public class Main
{    public static void insertionsort(int arr[])
     {
        int n=arr.length;
        
       for(int i=1;i<=n-1;i++)
       {
          // insert ith element
          int temp=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>temp)
          {
              arr[j+1]=arr[j];
              j--;
          }
          
          //pos is j+1;
          
          arr[j+1]=temp;
          
       }
       
       
       //print array
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i]+"  ");
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
        insertionsort(arr);
	       
	}
}

