package com.codeit.javaExam.Hero;

/*
 *      Concrete 구현체 = StrengthHeroRepository < HeroRepository 인터페이스 내 구현되지 않은 추상 메서드 구현
 *      - StrengthHeroRepository 구현 클래스가 제공하는 것은 StrengthHero 구현 클래스 < Hero 인터페이스의 구현체
 */
public class StrengthHeroRepository extends BasicHeroRepository<StrengthHero> {
    public StrengthHeroRepository(StrengthHero[] heroes) {
        super(heroes);
    }
//    public StrengthHeroRepository() {
//        super(new StrengthHero[]{
//                new StrengthHero("Slardar"),
//                new StrengthHero("Dragon Knight"),
//                new StrengthHero("Centaur Warchief")
//        });
//    }

//    public Hero[] strengthHeroes = new StrengthHero[]{
//            new StrengthHero("Slardar"),
//            new StrengthHero("Dragon Knight"),
//            new StrengthHero("Centaur Warchief")
//    };

    // 공통 메서드이기에 BasicHeroRepository 추상 클래스로 이동
//    @Override
//    public Hero findHeroByName(String name) {
//        for (Hero hero : super.heroes) {
//            if (hero.getName().equals(name)) {
//                return hero;
//            }
//        }
//
//        throw new RuntimeException("당신이 찾는 Strength Hero가 없습니다. : " + name);
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
//        newHeroes[newHeroes.length - 1] = new StrengthHero(name);
//
//        heroes = newHeroes;
//    }
}
