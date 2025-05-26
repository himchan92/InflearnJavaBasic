package string.ex;

public class StringEx6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int count = 0;

        String[] arr = str.split(" ");
        for(String idx : arr) {
            if(idx.equals(key)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
