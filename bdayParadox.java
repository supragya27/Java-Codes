class Main
{
    static int getNum(double p)
    {
        return (int)Math.ceil(Math.sqrt(2*365*Math.log(1/(1-p))));
    }
    public static void main(String[] args)
    {
        System.out.println(getNum(0.50));
    }
    }