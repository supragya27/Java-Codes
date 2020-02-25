import java.util.Scanner;
class InsertionSort
{
    void print(int arr[])
    {        
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    void iSort(int arr[])
    {
        int i,j,temp;
        for(i=1;i<arr.length;i++)
        {
            j=i-1;
            temp=arr[j+1];
            while(j>=0&&(temp<arr[j]))
            {
                arr[j+1]=arr[j];
                j--;
            }      
            arr[j+1]=temp;      
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        int arr[]={5,4,6,3,7,2,8,1};
        InsertionSort o1=new InsertionSort();     

        System.out.println("Before Sorting:");
        o1.print(arr);

        o1.iSort(arr);

        System.out.println("After Sorting:");
        o1.print(arr);
        

    }
    }