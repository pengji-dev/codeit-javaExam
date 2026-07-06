package com.codeit.javaExam;

import java.util.Scanner;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);
        Scanner sc = new Scanner(System.in);

        String dayType;
        System.out.println("요일을 입력하세요. ex) MONDAY");
        String day = sc.nextLine();

        switch (day) {
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                dayType = "Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                dayType = "Weekend";
                break;
            default:
                dayType = "Unknown";
        }

        System.out.println(dayType);
    }
//	Java 8 버전: switch문엔 각 case 조건 마지막에 break를 넣어줘야 했다.
}
