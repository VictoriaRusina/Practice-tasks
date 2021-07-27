import java.util.Arrays;
public class ArrayFinal {
    //Задание 2.1 a number to search in the array
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int size = numbers.length;
        System.out.println(size);
        System.out.println("the first number is " + numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        long startTime = System.nanoTime();
        boolean findResult = linearSearch(numbers, 1);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);
        System.out.println(findResult);
    }

    public static boolean linearSearch(int[] numbers, int find) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == find) {
                return true;
            }
        }
        return false;
    }
}
