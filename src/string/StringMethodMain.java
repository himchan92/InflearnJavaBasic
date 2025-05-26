package string;

import java.sql.SQLOutput;

public class StringMethodMain {
    public static void main(String[] args) {
        String str = "Hello Java! Welcome to JAVA";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());

        String[] arr = str.split(" ");
        for(String item : arr) {
            System.out.println(item);
        }

        //결합
        String joinStr = "";
        for(String s : arr) {
            joinStr += s + "-";
        }
        System.out.println(joinStr);

        String join = String.join("test", arr); //배열 요소결합
        System.out.println(join);
    }
}
