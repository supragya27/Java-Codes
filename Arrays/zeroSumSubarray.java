import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        int arr[]={-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,9},sum,f=0;
        m:
        for(int a=0;a<arr.length;a++){
            sum=0;
            for(int b=a;b<arr.length;b++){
                  sum+=arr[b];
                  if(sum==0)
                  {   f=1;
                      System.out.println("yes, a subarray with sum equal to zero is present.");
                      break m;
                  }
            }
        }
        if(f==0)
        System.out.println("no subarray with sum equal to zero is present.");
    }
    }