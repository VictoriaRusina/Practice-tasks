/*
public class IntPractice {
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
*/


/*
public class IntPractice {
    public static void main(String[] args) { //строка объявления метода main
       getMin(7,6,10); //не пишем int min =...,т.к. метод getMin не возвращает значения
    }
    public static void getMin(int int1, int int2, int int3){
        if(int1<int2 && int1<int3)
            System.out.println(int1);
        else if(int2<int3)
        {
            System.out.println(int2);
        }
        else System.out.println(int3);
    }
}
*/



public class IntPractice {
    public static void main(String[] args)
    {
        getMin(3,7);
    }
    public static void getMin(int int1, int int2)
    {
        if (int1<int2)
            System.out.println(int1);
        else System.out.println(int2);
    }
}


/* Задание 2
public class IntPractice {

    public static void main(String[] args)
    {
        int min1 = getMin(2, 5);
        int min2 = getMin(min1, 3);
        if (min1 < min2)
            System.out.println(min1);
        else System.out.println(min2);
    }

    public static int getMin(int int1, int int2)
    {
        if (int1 < int2)
            return int1;
        else return int2;
    }
}
*/



/* Задание 3
public class IntPractice
{
    public static void main(String[] args)
    {
        int min1 = getMin(3, 2);
        int min2 = getMin(min1, 5);
        int min3 = getMin(min2, 1);
        if (min1 < min2 && min1<min3)
            System.out.println(min1);
        else if(min2<min3)
            System.out.println(min2);
        else System.out.println(min3);
    }

    public static int getMin(int int1, int int2)
    {
        if (int1 < int2)
            return int1;
        else return int2;
    }
}
*/
