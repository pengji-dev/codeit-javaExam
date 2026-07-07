package com.codeit.javaExam.member;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)     // 생성자의 접근 제어자 옵션 설정 가능
public class Member {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;

//    public Member(Integer id, String name, int age, String email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }
}
