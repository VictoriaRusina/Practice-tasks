//Задание binary search+bubble sort
import java.util.Arrays;
public class ArrayPractice5
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3};
        bubbleSort(numbers);
    }

    public static void bubbleSort(int[] numbers)
    {
        {
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.print(numbers[i] + "  ");
            }
            System.out.print("\n");

            int index = Arrays.binarySearch(numbers, 2);
            if(index == -1){
                System.out.println("False");
            } else{
                System.out.println("True");
            }
        }
    }
}