package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

//        일반 for문 : 시작이 'int i = 1;'부터면 종료는 'i <= 5;'가 됨. / 시작이 'int i = 0;'부터면 종료는 'i < 5;'가 됨.
    }
}
