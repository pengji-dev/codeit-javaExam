package com.codeit.javaExam;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

//      향상된 for문 : 배열이나 JCF(Java Collection Framework) 다양한 자료구조로부터 하나씩 꺼내오는 방식
        int[] scores = {90, 85, 78};

        for (int s : scores) {
            System.out.println("점수 : " + s);
        }
    }
}
