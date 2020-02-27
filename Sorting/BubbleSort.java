import java.util.Scanner;
class BubbleSort
{
    void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    void sort(int arr[])
    {
        int n=arr.length,f,temp,s=0;
        for(int i=0;i<n;i++)
        { f=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    s++;
                    f=1;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(f==0)
            break;
        }
        System.out.println();
            System.out.println("No of swaps done for sorting= "+s);

    }
}
class Main
{
    public static void main(String[] args)
    {
        int arr[]={4,5,3,2,1};
        BubbleSort b=new BubbleSort();

        System.out.println("Before Sorting:");
        b.printArr(arr);    

        b.sort(arr);
        
        
        System.out.println("After Sorting:");
        b.printArr(arr);        
    }
    }