package com.codeit.javaExam.Hero;

/*
 *      Concrete 구현체 = class < implements HeroAttack, HeroUltimate
 *      클래스에서 "다중 구현"이 가능 -> 하나의 클래스를 만들기 위해 여러 개의 인터페이스를 모아 구현할 수 있다.
 *      - 일반적으로 최종 구현 클래스에서는 다형성을 사용하기 위해 하나의 인터페이스만을 implements로 갖는다.
 *      - implements HeroAttack, HeroUltimate
 *          - 여러 개의 인터페이스를 모아 하나의 클래스에서 "다중 구현"으로 모두 구현할 수 있다.
 *          - 일반적으로 이렇게 사용하지 않는 이유는 AgilityHero나 StrengthHero 구현 클래스는 Hero 인터페이스의 다형성을 사용하지 못한다.드
 *
 *      * 최종적으로 AgilityHero 등 구현 클래스는 Hero 인터페이스가 아닌 BasicHero 추상 클래스를 바라보게 된다.
 *          - Hero 인터페이스의 추상 메서드는 AgilityHero / StrengthHero 구현 클래스에서 구현한 케이스
 *              - 구현 클래스 :     필드 선언    +        구현 메서드 선언
 *              - 추상 클래스 : 공통 필드 선언    +    공통 구현 메서드 선언    +    추상 메서드 선언
 *              - 인터페이스  :                                        +     추상 메서드 선언
 *
 *          - AgilityHero / StrengthHero 구현 클래스에 있던 공통 필드와 공통 메서드를 BasicHero 추상 클래스로 옮긴 것
 *              - 구현 클래스 :     필드 선언    +        구현 메서드 선언
 *              - 추상 클래스 : 공통 필드 선언    +    공통 구현 메서드 선언    +    추상 메서드 선언
 *              - 인터페이스  :                                        +     추상 메서드 선언
 */
public class AgilityHero extends BasicHero {
    public AgilityHero(String name) {
        super(name);
    }

    @Override
    // public abstract void attack();
    // - public interface Hero에 있던 추상 메서드를 구체 메서드로 구현
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    // public abstract void ultimate();
    // - public interface Hero에 있던 추상 메서드를 구체 메서드로 구현
    public void ultimate() {
        System.out.println("Evasion");
    }
}
