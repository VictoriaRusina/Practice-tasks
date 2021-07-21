/* Задание 2 array size
public class ArraysPractice
{
    public static void main(String[] args)
    {
        int[] numbers = new int[2];
        numbers[0]=1;
        numbers[1]=2;

        int size = numbers.length;
        System.out.println(size);
    }
}
*/

/* Задание 2.1 a number to search in the array
public class ArraysPractice
{
    public static void main(String[] args)
    {
        int[] numbers = new int[2];
        numbers[0]=1;
        numbers[1]=2;

        System.out.println("the first number is " + numbers[0]);
    }
}
 */



/* test1
public class ArraysPractice
{ public static void main(String[] args)
 {     int[] numbers = {1, 2};
        for (int elem : numbers) {
            if (elem == 3) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
*/




/* Задание 2.3 Generate a random array of integers of provided size and print it
public class ArraysPractice
{ public static void main(String[] args) {
       int[] numbers = {1, 2, 1, -1};
        for ( int i=0; i <= 3; i++) {
            if (numbers [i] == 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
*/

/*
//Задание 2.4 binary search
import java.util.Arrays;
public class ArraysPractice
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
*/






/* Задание 3 sort array, selection sort
import java.util.Arrays;
public class ArraysPractice
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

