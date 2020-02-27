import java.util.Scanner;
class SelectionSort
{
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void sSort(int arr[])
    {
        int temp,s;
        for(int i=0;i<arr.length-1;i++)
        {
            s=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[s])
                s=j;
            }
            temp=arr[i];
            arr[i]=arr[s];
            arr[s]=temp;
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        int arr[]={7,6,5,2,1,3,4};
        SelectionSort o1=new SelectionSort();
        o1.sSort(arr);
        o1.print(arr);
    }
    }