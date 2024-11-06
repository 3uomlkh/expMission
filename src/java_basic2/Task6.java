package java_basic2;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    // 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("평균 : " + getAverage(arr));
        System.out.println("배열 요소 변경 : " + Arrays.toString(changeArray(arr)));
        System.out.println("변경된 배열 평균 : " + getAverage(arr));
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }
    public static int[] changeArray(int[] arr) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
