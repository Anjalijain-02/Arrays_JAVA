import java.util.*;

public class Main
{    public static void pushzero(int arr[])
     {
         int temp[]=new int[arr.length];
         
        int n=arr.length;
        int c=0;
        int k=0;
       for(int i=0;i<n;i++)
       {
           
           if(arr[i]!=0)
           {
               temp[k]=arr[i];
               k++;
           }
           
       }
       
           for(int i=0;i<n;i++)
           {
       if(arr[i]==0)
           {
               temp[k]=0;
               
           }
           }
       
       // final array print
       for(int i=0;i<n;i++)
       {
           System.out.print(temp[i]+"  ");
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
        pushzero(arr);
	       
	}
}
