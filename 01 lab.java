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




