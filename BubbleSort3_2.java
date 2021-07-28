import java.util.Arrays;
public class BubbleSort3_2 {

    final static int SIZE = 25;
    final static int NUMBER_TO_SEARCH = 5;

    public static void main(String[] args) {
        int[] numbers = new int[SIZE];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round(Math.random() * 100);
        }
        System.out.println("array length " + numbers.length);
        // Вывод массива, заполненого рандомными числами
        System.out.println("array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Сортировка массива и его вывод
        var sortedArray = bubbleSort(numbers);
        System.out.println("\nsorted array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        // Отсчет времени поиска элемента и вызов бинарного поиска
        long startTime = System.nanoTime();
        int index = Arrays.binarySearch(sortedArray, NUMBER_TO_SEARCH);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("\ntime " + duration);
        // Если искомый элемент не найден - false, иначе true
        if (index == -1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static int[] bubbleSort(int[] numbers) {
        for(int i = numbers.length - 1 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++){
                if(numbers[j] > numbers[j + 1] ){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        return numbers;
    }
}