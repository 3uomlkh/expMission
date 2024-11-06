package java_basic2;

import java.util.Scanner;

public class Task4 {
    // 두 개의 정수를 더하고 빼는 메서드 작성하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("덧셈 : " + add(a, b));
        System.out.println("뺄셈 : " + sub(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
}
