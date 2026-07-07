package com.codeit.javaExam;

import com.codeit.javaExam.member.Member;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        Member aaron = new Member(1, "aaron", 10, "aaron@example.com");

        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체
    }
}
