package java_basic2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    // 5개의 정수 오름차순 정렬하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
