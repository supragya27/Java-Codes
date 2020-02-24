import java.util.Scanner;
class MergeSort
{
    void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void sort(int arr[],int left,int right)
    {
        if(left<right)
        {
            int m=(left+right)/2;
            sort(arr,left,m);
            sort(arr,m+1,right);

            merging(arr,left,m,right);
        }
    }
    void merging(int arr[],int left,int m,int right)
    {
        int n1=m-left+1,n2=right-m,i,j,k=left;
        int L[]=new int[n1], R[]=new int[n2];
        for(i=0;i<n1;i++)
        L[i]=arr[left+i];
        for(j=0;j<n2;j++)
        R[j]=arr[m+1+j];
        i=0;j=0;
        while(i<n1&&j<n2)
        {
            if(L[i]<=R[j]){
                arr[k]=L[i]; i++;
            }
            else{
                arr[k]=R[j]; j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];k++;i++;
        }
        while(j<n2){
            arr[k]=R[j];k++;j++;
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        int arr[]={3,7,5,9,3,8,27,4};

        MergeSort o1=new MergeSort();
        
        System.out.println("Before sorting:");
        o1.print(arr);

        o1.sort(arr,0,arr.length-1);

        System.out.println("After sorting:");
        o1.print(arr);
    }
    }