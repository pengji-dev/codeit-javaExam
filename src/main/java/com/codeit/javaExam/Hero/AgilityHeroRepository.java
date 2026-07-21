package com.codeit.javaExam.Hero;

/*
 *      Concrete 구현체 = AgilityHeroRepository < HeroRepository 인터페이스 내 구현되지 않은 추상 메서드 구현
 *      - AgilityHeroRepository 구현 클래스가 제공하는 것은 AgilityHero 구현 클래스 < Hero 인터페이스의 구현체
 *
 *      * HeroRepository 인터페이스의 구현 클래스들 내 공통 필드 + 공통 메서드
 *          - AgilityHeroRepository 내 AgilityHero[] -> 다형성을 적용하면 Hero[]
 *          - StrengthHeroRepository 내 StrengthHero[] -> 다형성을 적용하면 Hero[]
 *              - 해당 두 구현 클래스 내 Hero[] 영웅들을 담는 공통 필드를 각각 갖고 있다.
 *              - Hero[] 영웅 배열에 CRUD(생성, 조회, 갱신, 삭제)라는 공통 메서드들도 있다.
 */

// 문제 (2) AgilityHeroRepository인데 불구하고 create 메서드 호출 시 Hero 인터페이스 다형성으로 StrengthHero를 넣을 수 있다.
// -> "귀"에 걸면 귀걸이, "코"에 걸면 코걸이인 "Generic"을 통해 BasicHeroRepository<AgilityHero>를 사용하자!
public class AgilityHeroRepository extends BasicHeroRepository<AgilityHero> {
    // 문제 (1)에 대한 불완전한 해결책
    // 기존 생성자에 Hero[] 배열이 아닌 AgilityHero[] 배열을 받게 함으로써 AgilityHero만 배열로 갖는 것만 생성자에 넘길 수 있게 제약을 걸었으나 실수 할 수 있다.
    // 미친 척하고 StrengthHero[] heroes 생성자로 만들 수 있다.
    public AgilityHeroRepository(AgilityHero[] heroes) {
        super(heroes);
    }


//    public AgilityHeroRepository(Hero[] heroes) {
//        super(heroes);
//    }

//    public AgilityHeroRepository() {
//        super(new AgilityHero[]{
//                new AgilityHero("Slark"),
//                new AgilityHero("Juggernaut"),
//                new AgilityHero("Drew Ranger")
//        });
//    }

//    public Hero[] agilityHeroes = new AgilityHero[] {
//            new AgilityHero("Slark"),
//            new AgilityHero("Juggernaut"),
//            new AgilityHero("Drew Ranger")
//    };

//    private AgilityHero[] agilityHeroes = new AgilityHero[]{
//            new AgilityHero("Slark"),
//            new AgilityHero("Juggernaut"),
//            new AgilityHero("Drew Ranger")
//    };

    // 공통 메서드이기에 BasicHeroRepository 추상 클래스로 이능
//    @Override
//    public Hero findHeroByName(String name) {
//        for (Hero hero : super.heroes) {
//            if (hero.getName().equals(name)) {
//                // 에러 발생 -> getName() 메서드가 Hero 인터페이스가 아닌 BasicHero 추상 클래스에 구현되어 있는 것
//                // 해결 방법 -> Hero 인터페이스 내 getName() 메서드를 만들어주어야 getName() 메서드 호출 가능
//                System.out.println("선택된 Hero는 " + hero.getName() + "입니다.");
//                return hero;
//            }
//        }
//
//        throw new RuntimeException("당신이 찾는 Agility Hero 없습니다. : " + name);
//    }

//    @Override
//    public void create(String name) {
//        for (Hero hero : super.heroes) {
//            if (hero.getName().equals(name)) {
//                throw new RuntimeException("이미 등록된 히어로입니다.");
//            }
//        }
//
//        Hero[] newHeroes = Arrays.copyOf(heroes, heroes.length + 1);
//        newHeroes[newHeroes.length - 1] = new AgilityHero(name);
//
//        heroes = newHeroes;
//    }


}
