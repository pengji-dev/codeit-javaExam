package com.codeit.javaExam.Hero;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

// 문제 (1) 해결을 위해 Generic 도입 = BasicHeroRepository<T>
// BasicHeroRepository<AgilityHero> 민첩 영웅 타입을 명시할 수 있도록 BasicHeroRepository<T> 영웅 저장소 클래스 내 Generic <T> 명시를 하였는데
// T 타입에는 AgilityHero든 StrengthHero든 다 들어갈 수 있게 되었지만 String이나 Integer 등 별의 별것이 다 들어갈 수 있게 되어 있어서 오류 발생
// 단순하게 Generic을 <T>로 명시하게 되면 모든 타입이 다 들어갈 수 있게 되어서 Hero 인터페이스 타입에만 존재하는 메서드 활용 시 에러 발생

// 문제 (1) 해결을 위해 Generic 도입 시 영웅 타입만을 받을 수 있도록 좁게 정의 = BasicHeroRepository<T extends Hero>
// 모든 세상의 클래스를 <T>로 다 받아낼 수 있어서 발생한 문제 해결을 위해 Hero 인터페일스 구현체 타입인 <T extends Hero>으로 Generic 타입을 좁혀버림
public abstract class BasicHeroRepository<T extends Hero> implements CrudRepository<T> {
    // protected로 한 이유 : 상속받은 자식 클래스에서 heroes를 접근해서 사용해야 하기에...
    private T[] heroes = (T[]) Array.newInstance(Hero.class, 0);

    public BasicHeroRepository(T[] heroes) {
        this.heroes = heroes;
    }

    @Override
    public T findHeroByName(String name) {
        // T 타입 중 Hero 인터페이스의 구현 클래스인 AgilityHero, StrengthHero에만 getName() 메서드가 있기 때문에 에러 발생
        for (T each : this.heroes) {
            if (each.getName().equals(name)) {      // <- 오류 발생 T 클래스 타입에 도대체 getName()이라는 메서드가 있는지 내가 어떻게 알아?
                // 오류 해결 : Hero 인터페이스 안에는 HeroInformation이 있었고 그 내부에 getName() 메서드가 있으니까
                return each;
            }
        }

        return null;
    }

    @Override
    public void create(T hero) {
        T retrieve = findHeroByName(hero.getName());

        if (Objects.nonNull(retrieve)) {
            throw new RuntimeException("똑같은 이름의 영웅이 이미 있습니다! - 입력받은 영웅 : " + hero.getName());
        }

        // 자바에서의 배열은 다른 List나 Set과 같은 JCF 컬렉션들과 달리 Generic T 사용이 불가해서 신규 제네릭 배열 생성 시 아래와 같이 사용해야 한다.
        T[] newHeroes = Arrays.copyOf(heroes, this.heroes.length + 1);
        System.arraycopy(this.heroes, 0, newHeroes, 0, this.heroes.length);
        newHeroes[this.heroes.length] = hero;
        this.heroes = newHeroes;
    }

    @Override
    public void delete(String name) {
        Hero retrieve = findHeroByName(name);

        if (Objects.isNull(retrieve)) {
            throw new RuntimeException("지유시려는 이름의 영웅이 기존에 없습니다! - 입력받은 영웅 : " + name);
        }

        byte found = 0;
        Hero[] newHeroes = new Hero[this.heroes.length - 1];

        for (int index = 0; index < this.heroes.length; index++) {
            Hero picked = this.heroes[index];

            if (!picked.getName().equals(name)) {
                newHeroes[index - found] = this.heroes[index];
            } else {
                found = 1;
            }
        }
    }
}
