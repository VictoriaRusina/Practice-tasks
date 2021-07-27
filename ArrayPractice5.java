//Задание binary search+bubble sort
import java.util.Arrays;
    public class ArrayFinal2 {
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
            bubbleSort(numbers);;
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println(duration);
        }

        public static void bubbleSort(int[] numbers)
        {
            {
                for (int i = 0; i < numbers.length; i++)
                {
                    System.out.print(numbers[i] + "  ");
                }
                System.out.print("\n");

                int index = Arrays.binarySearch(numbers, 1);
                if(index == -1){
                    System.out.println("False");
                } else{
                    System.out.println("True");
                }
            }
    }
}
