//regular search = linear search
import java.util.Arrays;
public class ArrayPractice7
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 4, 3, 2, 12};
        int search = 12;

        for (int index = 0; index < numbers.length; index++)
        {
            if (numbers[index] == search)
            {
                System.out.println(index);
                break;
            }

        }
    }
}
