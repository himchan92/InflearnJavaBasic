package string.ex;

public class StringEx2 {
    public static void main(String[] args) {
        int length = 0;
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        for(String idx : arr) {
            System.out.println(idx.length());
            length += idx.length();
        }

        System.out.println(length);
    }
}
