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

        System.out.println(aaron.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(aaron.getName());    // @Getter (클래스 단위)
        System.out.println(aaron.getAge());     // @Getter (클래스 단위)
        System.out.println(aaron.getEmail());   // @Getter (클래스 단위)
    }
}
