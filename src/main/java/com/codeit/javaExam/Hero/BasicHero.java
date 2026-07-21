package com.codeit.javaExam.Hero;

import lombok.Getter;

/*
 *      추상 클래스 : 인터페이스 -> 다수 구현 클래스 간 공통 필드 / 공통 메서드 저장을 위한 중간 클래스
 *      - 구현 클래스 :     필드 선언    +        구현 메서드 선언
 *      - 추상 클래스 : 공통 필드 선언    +    공통 구현 메서드 선언    +    추상 메서드 선언
 *      - 인터페이스  :                                        +     추상 메서드 선언
 *
 *      Hero 인터페이스의 구현 클래스들 내 공통 필드 + 공통 메서드
 *      - AgilityHero 내 name (공통 필드)
 *      - StrengthHero 내 name (공통 필드)
 *      - name 영웅 이름 조회에 사용되는 getName() (공통 메서드)
 */
public abstract class BasicHero implements Hero {
    @Getter
    // 공통 필드
    private final String name;

    // 공통 메서드
    public BasicHero(String name) {
        this.name = name;
    }
}
