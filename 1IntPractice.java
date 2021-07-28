public class 1IntPractice {
    public static void main(String[] args) {
        int a = getMin(3, 7, 6, 55);
    }
    public static int getMin(int int1, int int2) {
        if (int1<int2)
            return int1;
        else
            return int2;
    }
    public static int getMin(int int1, int int2, int int3) {
        int a = getMin(int1, int2);
        return getMin(a, int3);
    }
    public static int getMin(int int1, int int2, int int3, int int4) {
        return getMin(getMin(int1, int2, int3), int4);
    }
}
