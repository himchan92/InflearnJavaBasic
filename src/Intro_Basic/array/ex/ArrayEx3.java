package Intro_Basic.array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for(int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for(int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        sc.close();
    }
}
