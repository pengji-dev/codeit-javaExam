package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        int countdown = 5;

//      while문 : 언제 끝낼지에 대한 조건을 설정해놓은 것을 바탕으로 루프를 돈다.
        while (countdown > 0) {
            System.out.println("countdown = " + countdown--);
        }
    }
}
