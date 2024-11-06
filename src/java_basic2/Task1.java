package java_basic2;

import java.util.Scanner;

public class Task1 {
    // 홀수, 짝수 판별 프로그램
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextInt() % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
