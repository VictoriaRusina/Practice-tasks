public class IntPractice3 {
    public static void main(String[] args) { //строка объявления метода main
        int min = getMin(7,6,10); //значение возвращается, поэтому оно записано в переменную min
        System.out.println(min);
    }
    public static int getMin(int int1, int int2, int int3){ //сделали свой метод для вызыва мин.значения
        if(int1<int2 && int1<int3)
            return int1;
        else if(int2<int3)
        {
            return int2; //без скобок выполняется одна строка кода, со скобками наоборот
        }
        else return int3;

    }
}