import java.util.*;

public class Main
{    public static void arrange_array(int arr[])
     {
          
          	int left=0;
          	int right=arr.length-1;
          	int count=1;
          while(left<=right)
          	{
          	    if(count%2==1)
          	    {
          	        arr[left]=count;
          	        left++;
          	        count++;
          	    }
          	    else
          	    {
          	        arr[right]=count;
          	        right--;
          	        count++;
          	    }
          	}
     }
          	
         
     
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter start value");
	    int start = sc.nextInt();
	    
	   System.out.println("enter end value");
	    int end = sc.nextInt();
	    	int arr[]=new int[end];
	    
	    
        arrange_array(arr);
        for(int i=0;i<=end;i++)
          	{
          	    System.out.println(arr[i]);
          	}
		
	}
}

