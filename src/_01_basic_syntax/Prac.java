package _01_basic_syntax;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
//        System.out.println("공백으로 구분하여 이름/나이를 입력해주세요 >>>");
        Scanner scanners = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanners.next(); // 공백 이전까지 문자열을 읽음
        System.out.println("나이를 입력하세요");
        int age = scanners.nextInt(); // 공백 이전까지 정수 읽기
//        System.out.println(name);
//        System.out.println(age);
        System.out.printf("안녕하세요! %s님, (%d세)", name ,age);
//        System.out.println("안녕하세요! " + name + "님("+age+"세)");
        scanners.close();// scanner 닫기
    }
}
