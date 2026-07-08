package com.codeit.javaExam;

import com.codeit.javaExam.member.Administrator;
import com.codeit.javaExam.member.Member;

//@SpringBootApplication
public class JavaExamApplication {
    public static void main(String[] args) {
//		SpringApplication.run(JavaExamApplication.class, args);

        Member member = new Member(1, "Aaron", 10, "aaron@example.com");

        System.out.println("---");
        System.out.println(member);                             // 객체 주소
        System.out.println(member.toString());                  // 객체
        System.out.println(member.MEMBER_TO_STRING_FORMAT);     // * 앞글자 소문자 : 물론 이렇게 호출할 수 있겠지만, 정상 사용은 아님.
        System.out.println(Member.MEMBER_TO_STRING_FORMAT);     // * 앞글자 대문자 : Static 필드는 이렇게 호출하는 것이 정상.
    }
}
