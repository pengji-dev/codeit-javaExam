package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);
        int age = 20;
        boolean isStudent = true;

        if (age >= 18 && isStudent) {
            System.out.println("성인 학생");
        }
//        중첩 if-else문을 사용할 수 있으나 들여쓰기가 너무 많이 발생하기 때문에 안티패턴에 해당한다.
//        가독성과 비즈니스 로직 상 명료성을 고려해서 작성해야 한다.
    }

}
