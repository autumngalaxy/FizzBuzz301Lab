package lab1;

public class Reduce
{
    public static void main(String[] args)
    {
        System.out.println(ReduceCounter(2));
        System.out.println(ReduceCounter(100));
    }

    public static int Reduce(int n){
        if(n % 2 == 0){
            return n / 2;
        }
        else{
            return n - 1;
        }
    }

    public static int ReduceCounter(int n){
        int count = 0;
        while (n != 0){
            n = Reduce(n);
            count++;
        }
        return count;
    }
}
