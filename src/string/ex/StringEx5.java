package string.ex;

public class StringEx5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        int index = str.indexOf(".txt");
        System.out.println("filename : " + str.substring(0, index));
        System.out.println("extName : " + str.substring(index, str.length()));
    }
}
