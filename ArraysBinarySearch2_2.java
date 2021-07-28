//Задание binary search
import java.util.Arrays;
    public class ArraysBinarySearch2_2 {
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
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println(duration);
                int index = Arrays.binarySearch(numbers, 1);
                if(index == -1){
                    System.out.println("False");
                } else{
                    System.out.println("True");
                }
            }
    }
