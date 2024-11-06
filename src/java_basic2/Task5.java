package java_basic2;

import java.util.Scanner;

public class Task5 {
    // 이름과 나이를 입력받아 출력하는 프로그램
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = in.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = in.nextInt();
        System.out.println("이름은 " + name + ", 나이는 " + age + "세 입니다.");
    }
}
