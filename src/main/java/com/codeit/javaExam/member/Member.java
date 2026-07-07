package com.codeit.javaExam.member;

import lombok.*;

@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
// @NoArgsConstructor : 인자없는 생성자 -> 클래스가 가진 모든 필드들이 언제 @Setter를 통해 설정되어도 상관이 없을 경우 사용
public class Member {
    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    private int age;
    private String email;

//    public Member(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }

//    인자없는 생성자
//    public Member() {
//
//    }
}
