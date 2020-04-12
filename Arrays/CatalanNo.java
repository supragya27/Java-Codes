package codes;

public class CatalanNo {

    static void func(int cn[],int n, int i)
    {
        if(i==0)
            cn[i]=1;

        else {
                int r = 0;
                for (int a = 0; a < i; a++) {
                    r += cn[a] * cn[i - a - 1];
                }
                cn[i] = r;

        }
        if(++i<n)
            func(cn,n,i);
    }

    public static void main(String args[])
    {
        int n=10;
        int catalanNo[]=new int[n];

        func(catalanNo,n,0);

        for(int i=0;i<n;i++)
            System.out.print(catalanNo[i]+" ");
    }
}
