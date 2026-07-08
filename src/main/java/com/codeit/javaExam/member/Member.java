package com.codeit.javaExam.member;

import lombok.*;

@Getter
@AllArgsConstructor
public class Member {
    public static String MEMBER_TO_STRING_FORMAT = "Member(id=%s, name=%s, age=%s, email=%s)";
    // Static 필드 : 객체(인스턴스) 없이 사용 가능한 필드(= 정적 필드)
    // -> final을 사용하지 않으면 수정의 위험이 있음

    private Integer id;
    private String name;
    private int age;
    private String email;

    public String toString() {
        return String.format(MEMBER_TO_STRING_FORMAT, this.id, this.name, this.age, this.email);
    }

    public static String toString(Member member) {
        return String.format(MEMBER_TO_STRING_FORMAT, member.id, member.name, member.age, member.email);
    }
    // Static 메서드 : 객체(인스턴스) 없이 사용 가능한 메서드
    // 인스턴스 생성 없이 호출 가능하여, 유틸리티 관련 메서드를 만드는데 유용하게 사용 (ex. Objects.isNull() 등)
}
