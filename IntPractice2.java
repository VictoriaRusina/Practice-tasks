public class IntPractice2 {
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
