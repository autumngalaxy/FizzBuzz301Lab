package lab1;

public class Reduce
{
    public static void main(String[] args)
    {
        System.out.println(reduceCounter(2));
        System.out.println(reduceCounter(100));
    }

    public static int reduce(int n){
        if(n % 2 == 0){
            return n / 2;
        }
        else{
            return n - 1;
        }
    }

    public static int reduceCounter(int n){
        int count = 0;
        while (n != 0){
            n = reduce(n);
            count++;
        }
        return count;
    }
}
