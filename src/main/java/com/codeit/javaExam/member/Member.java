package com.codeit.javaExam.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)     // 생성자의 접근 제어자 옵션 설정 가능
public class Member {
    private Integer id;
    private String name;
    private int age;
    private String email;

//    public Member(Integer id, String name, int age, String email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }
}
