package string.ex;

public class StringEx4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        System.out.println("filename : " + str.substring(0, 5));
        System.out.println("extName : " + str.substring(5, str.length()));
    }
}
