package com.codeit.javaExam.member;

import lombok.AllArgsConstructor;

@AllArgsConstructor     // 해당 객체의 생성자 생성(모든 인자)
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
