import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int arr[]={2,18,24,3,5,7,9,6,12};
        LinkedList<Integer> li=new LinkedList<>();
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2==0)
           {
               li.add(arr[i]);
           }
           else
           {
               int j=1;
               while(li.size()!=0)
               {
                  arr[i-j]=li.removeFirst();
                  j++;
               }
           }
        }

        int j=1;
               while(li.size()!=0)
               {
                  arr[arr.length-j]=li.removeFirst();
                  j++;
               }


        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    }