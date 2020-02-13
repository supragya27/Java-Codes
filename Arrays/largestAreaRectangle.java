import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int arr[]={6,2,5,4,5,1,6},area=arr[0],sm;
        for(int a=0;a<arr.length;a++){
            sm=arr[a];
            for(int b=a;b<arr.length;b++){
                   if(sm>arr[b]){
                   sm=arr[b];                   
                   }
                   if(area<(sm*(b-a+1)))
                   area=sm*(b-a+1);
            }
        }
        System.out.println(area);
    }
    }