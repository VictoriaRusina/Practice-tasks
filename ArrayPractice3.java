//generate and verify provided element
public class ArrayPractice3
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