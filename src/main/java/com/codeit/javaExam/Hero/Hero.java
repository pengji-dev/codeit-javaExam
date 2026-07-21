package com.codeit.javaExam.Hero;

/*
 *      Abstract 추상 = interface
 *      - 인터페이스가 가진 메서드들은 public abstract 키워드로 정의되어 있다.
 *          - 즉, 구현되어 있지 않는 추상(abstract) 메서드라는 것
 *
 *      * 단축키 : Option + Commend + (Click)
 *          - 해당 인터페이스(혹은 부모 클래스)의 구현체(혹은 자식 클래스)가 무엇이 있는지 리스트로 간편히 보여준다.(쉽게 이동 가능)
 *
 *      - 인터페이스만 "다중 상속"이 가능
 *          - 클래스는 다중 상속이 되지 않지만 인터페이스는 여러 인터페이스를 조합할 수 있도록 예외적으로 허용되었다.
 *
 *      Interface Segregation
 *      - Hero 인터페이스(하나의 거대 인터페이스) -> HeroAttack 인터페이스 / HeroUltimate 인터페이스 (다수의 세부 인터페이스)로 나누는 것
 *      - 인터페이스는 작은 단위로 나누어서 조합해서 사용하는 것이 객체 지향적으로 사용하는 방식이다.
 *      - SOLID 원칙 중 하나 -> Interface Segregation 인터페이스 분리 원칙
 *          1) 인터페이스 안에 최소한의 필요 메서드만을 가져서 구현의 귀찮음을 최소화하고
 *          2) 작은 인터페이스들을 조합해서 인터페이스를 만들어라
 */
public interface Hero extends HeroAttack, HeroUltimate, HeroInformation {
    
}
