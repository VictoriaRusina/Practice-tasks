public class ElementsInAString {
    public static void main(String[] args) {
        String s = "Hello, let me see you again";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}

