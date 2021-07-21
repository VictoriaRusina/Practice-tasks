public class IntPractice4
{
    public static void main(String[] args)
    {
        int min1 = getMin(3, 2);
        int min2 = getMin(min1, 5);
        int min3 = getMin(min2, 1);
        if (min1 < min2 && min1<min3)
            System.out.println(min1);
        else if(min2<min3)
            System.out.println(min2);
        else System.out.println(min3);
    }

    public static int getMin(int int1, int int2)
    {
        if (int1 < int2)
            return int1;
        else return int2;
    }
}