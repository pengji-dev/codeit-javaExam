package com.codeit.javaExam;

import com.codeit.javaExam.member.Administrator;
import com.codeit.javaExam.member.Member;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        Member aaron = new Member();

        aaron.setId(1);
        aaron.setName("Aaron");
        aaron.setAge(10);
        aaron.setEmail("aaron@example.com");

        System.out.println("---");
        System.out.println(aaron);              // 객체
        System.out.println(aaron.toString());   // 객체

//        aaron.setId();                        // @Setter 필드 단위로 설정되어 있지 않아 필드 수정 불가능
//        aaron.setName();                      // @Setter 필드 단위로 설정되어 있지 않아 필드 수정 불가능
//        aaron.setAge(20);                     // @Setter 필드 단위로 설정되었지만, 접근 제어자를 private으로 바꾸어서 외부에서 호출 불가
        aaron.setEmail("aaron@different.com");  // @Setter (필드 단위)

        System.out.println(aaron.getId());      // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(aaron.getName());    // @Getter (클래스 단위)
        System.out.println(aaron.getAge());     // @Getter (클래스 단위)
        System.out.println(aaron.getEmail());   // @Getter (클래스 단위)
    }
}
