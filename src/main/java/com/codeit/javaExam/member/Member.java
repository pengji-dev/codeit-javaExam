package com.codeit.javaExam.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true)
// onlyExplicitlyIncluded 옵션 : ture 시, @ToString.Include로 지정된 필드만 선택적으로 출력
@AllArgsConstructor(access = AccessLevel.PUBLIC)     // 생성자의 접근 제어자 옵션 설정 가능
public class Member {
    @ToString.Include(name = "memberId")            // name 옵션 : 출력 시 이름을
    private Integer id;
    @ToString.Include(rank = -1)                    // rank 옵션 : 필드들의 출력 순서를 제어 (기본값은 0) -> 기본값보다 뒤에 출력
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
