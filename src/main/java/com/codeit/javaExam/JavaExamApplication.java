package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        int countdown = 5;

//      do-while문 : '무조건 한번은 실행된다'는 사실을 알려주기 위한 예제
//      int형의 범위인 -21억까지 실행되다가 종료됨.
        do {
            System.out.println("countdown = " + countdown--);
        } while (countdown < 5);
    }
}
