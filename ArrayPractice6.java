//sort array, selection sort
import java.util.Arrays;
public class ArrayPractice6
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 4, 3, 2};
        selectionSort(numbers);
    }
    public static void selectionSort(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            int min = numbers[i];
            int min_i = i;
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[j] < min) {
                    min = numbers[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = numbers[i];
                numbers[i] = numbers[min_i];
                numbers[min_i] = tmp;
            }
        }
        // Вывод результата на экран ПОСЛЕ того как отсортирован ВЕСЬ массив
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}