package _02_control_statement;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요"); // 출력
        int age = scanner.nextInt(); // 공백 이전까지 정수 읽기
        if(age > 0 && age <= 7 ){
            System.out.println("유아"); // 출력
        }else if(age > 7 && age <= 13 ){
            System.out.println("초등학생"); // 출력
        }else if(age > 13 && age <= 16 ){
            System.out.println("중학생"); // 출력
        }else if(age > 16 && age <= 19 ){
            System.out.println("고등학생"); // 출력
        }else{
            System.out.println("성인"); // 출력
        }

        System.out.println("이름을 입력하세요"); // 출력
        String name = scanner.next(); // 공백 이전까지 정수 읽기
        if(name.equals("홍길동")){
            System.out.println("남자"); // 출력
        }else if(name.equals("성춘향")){
            System.out.println("여자"); // 출력

        }else{
            System.out.println("모르겠어요"); // 출력
        }
        scanner.close();// scanner 닫기
    }
}
