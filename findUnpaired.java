class Main
{
    static int unpaired(int arr[])
    {
        int res=arr[0];
        for(int i=1;i<arr.length;i++)
        res^=arr[i];
        return res;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,4,3,2,1};
        System.out.println(unpaired(arr));
    }
    }