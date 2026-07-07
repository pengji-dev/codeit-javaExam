package com.codeit.javaExam.member;

import lombok.*;

@Getter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false)
// onlyExplicitlyIncluded 옵션 : ture 시, @ToString.Include로 지정된 필드만 선택적으로 출력
// includeFieldNames 옵션 : false 시, 지정된 필드명을 노출하고 싶지 않을 때 사용하는 옵션
@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {
    @ToString.Include(name = "memberId")            // name 옵션 : 출력 시 이름을
    private final Integer id;                       // @RequiredArgsConstructor 사용 시, 생성자로 설정해야 하는 필드(final)만 설정
    @ToString.Include(rank = -1)                    // rank 옵션 : 필드들의 출력 순서를 제어 (기본값은 0) -> 기본값보다 뒤에 출력
    private final String name;
    @Setter(AccessLevel.PRIVATE)
    private int age;
    @Setter
    private String email;

//    public Member(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
