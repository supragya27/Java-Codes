import java.util.Scanner;

//QuickSort when last element is taken as pivot

class QuickSort
{
    void print(int arr[]){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    void sort(int arr[],int low,int high)
    {
      if(low<high)
      {
          int p=partition(arr,low,high);

          sort(arr,low,p-1);
          sort(arr,p+1,high);
      }
    }
    int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1,temp;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return ++i;
    }
}
class Main
{
    public static void main(String[] args)
    {
        int arr[]={9,8,7,6,5,4,5,3,2,1};
        QuickSort obj=new QuickSort();
        System.out.println("Before Sorting:");
        obj.print(arr);

        obj.sort(arr,0,arr.length-1);
        
        System.out.println("After Sorting:");
        obj.print(arr);
    }
    }