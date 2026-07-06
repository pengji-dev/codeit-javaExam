package com.codeit.javaExam.member;

public class Member {
    Integer id;     // Reference Type 주소를 담는 그릇 : 객체가 담기며, NULL이 들어갈 수 없다.
    String name;
    int age;        // Primitive Type 값을 담는 그릇 : 값 그 자체가 담기며, NULL이 들어갈 수 없다. (무조건 값이 있어야 하기에 기본값 존재)
    String email;

    public Member(String name, String email) {
//        this.id = null;       // Reference Type이기 때문에 값을 설정하지 않으면 NULL이 들어간다.
        this.name = name;
//        this.age = age;       // Primitive Type이기 때문에 값을 설정하지 않으면 기본값이 0이 된다.
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
}
