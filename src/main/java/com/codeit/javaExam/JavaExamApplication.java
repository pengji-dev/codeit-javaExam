package com.codeit.javaExam;

import com.codeit.javaExam.member.Administrator;
import com.codeit.javaExam.member.Member;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);
        Administrator aaron = new Administrator("Aaron", "aaron@example.com", "DEVELOPER");
        Administrator baron = new Administrator("Baron", "baron@example.com", "MANAGER");

        System.out.println("---");
        System.out.println(aaron);                    // 객체
        System.out.println(aaron.toString());        // 객체
        System.out.println(aaron.getName());        // 필드 중 name
//        System.out.println(aaron.name);            // 필드 중 name (접근제어자 private)

        System.out.println("---");
        System.out.println(baron);                    // 객체
        System.out.println(baron.toString());        // 객체
        System.out.println(baron.getName());        // 필드 중 name
//        System.out.println(baron.name);                // 필드 중 name (접근제어자 private)
    }

}
