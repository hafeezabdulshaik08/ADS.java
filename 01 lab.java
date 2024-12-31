 import java.util.Scanner;
 public class bubblesort
{
    public static void bs(int a[],int n)
    {
        int i,j,temp;
        for(i = 0; i< n-1 ; i++)
        {
            for(j = 0;j < n -1-i; j++)
            {
                if(a[j] > a[j+1])
                {   
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of the array");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("enter the elements");
        for(i = 0;i<n;i++)
        {
            j = sc.nextInt();
            a[i] = j;
        }
        bs(a,n);
        for(i = 0; i<n;i++)
        {
            System.out.print("  "+a[i] );
        }
    }


}



import java.util.Scanner;
public class selectionsort{
	public static void Selectionsort(int a[],int n){
		int i,j,minpos,temp;
		for(i=0;i<n-1;i++){
			minpos=i;
			for(j=i+1;j<=n-1;j++){
				if(a[j]<a[minpos])
					minpos=j;
			}
			temp=a[i];
			a[i]=a[minpos];
			a[minpos]=temp;
		}
	}
	public static void main(String[] args){
        	int n,i,j;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter the number of elements of the array");
        	n = sc.nextInt();
        	int a[] = new int[n];

        	System.out.println("enter the elements");
       		for(i = 0;i<n;i++){
            	j = sc.nextInt();
            	a[i] = j;
        	}
        	Selectionsort(a,n);
        	for(i = 0; i<n;i++){
            		System.out.print("  "+a[i] );
        	}
    	}


}


import java.util.Scanner;
public class Insertionsort {
	public static void sort(int a[]){
        	int n = a.length;
        	for (int i = 1; i < n; ++i) {
            	int key = a[i];
            	int j = i - 1;
            	
            		while (j >= 0 && a[j] > key) {
               		a[j + 1] = a[j];
                	j = j - 1;
            		}
            	a[j + 1] = key;
       		}
       	}		
	public static void main(String[] args){
        	int n,i,j;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter the number of elements of the array");
        	n = sc.nextInt();
        	int a[] = new int[n];

        	System.out.println("enter the elements");
       		for(i = 0;i<n;i++){
            	j = sc.nextInt();
            	a[i] = j;
        	}
        	sort(a);
        	for(i = 0; i<n;i++){
            		System.out.print("  "+a[i] );
        	}
    	}


}



import java.util.Scanner;
public class binarysearch
{
	public static int bs(int a[],int key,int n)
	{
		int low = 0;
		int high = n-1;
		int mid;
		
		while(low <= high)
		{
			mid = (low+high)/2;
			if (key == a[mid])
			{
				return mid;
			}
			else if (key < a[mid])
			{
				high = mid-1;
			
			}
			else 
			{
				low = mid+1;
			}
		}
		return -1;
		
	}	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int i,j,n,key;
	System.out.println("enter the number of elements in the array ");
	n = sc.nextInt();
	int a[] =  new int [n];
	System.out.println("enter the elements of the array");
	for(i = 0;i<n;i++)
	{
		j = sc.nextInt();
		a[i] = j;
	
	}
	System.out.println("enter the key");
	key = sc.nextInt();
	
	
	int result = bs(a,key,n);
	if(result == -1)
	{
		System.out.println("the key is not found");
	}
	else
	{
		System.out.println("the key is found at the index"+result);
	}
}


