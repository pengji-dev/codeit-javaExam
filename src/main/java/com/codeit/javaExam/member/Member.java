package com.codeit.javaExam.member;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PUBLIC)     // 생성자의 접근 제어자 옵션 설정 가능
public class Member {
    private Integer id;
    private String name;
    @Setter(AccessLevel.PRIVATE)
    @ToString.Exclude               // @ToString.Exclude : 미출력 필드 제외
    private int age;
    @Setter
    @ToString.Exclude               // @ToString.Exclude : 미출력 필드 제외
    private String email;

//    public Member(Integer id, String name, int age, String email) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }
}
