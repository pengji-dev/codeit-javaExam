package com.codeit.javaExam;

import java.util.Scanner;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);
        Scanner sc = new Scanner(System.in);

        System.out.println("요일을 입력하세요. ex) MONDAY");
        String day = sc.nextLine();

        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Unknown";
        };    // 무언가 대입하는 식(Expression)이므로 끝에 세미콜론(;) 필수!

        System.out.println(dayType);
    }
//	Java 14 버전: break 쓰지 않고 간단하게 switch문 사용 가능하며 ':' 아닌 '->' 사용
//  switch문 자체적으로 값 반환 가능 : switch문 각각 case 조건 안에서 바로 값 반환
//  switch문에서 다수의 case 조건을 하나로 묶을 수 있음 : 다수의 조건을 ','으로 이으면 됨.
}
