package com.codeit.javaExam.Hero;

// abstract (추상) 인터페이스 : 메서드들은 내부 로직이 구현되어 있지 않고, 구현되기를 기다리고 있음
// HeroRepository 인터페이스 : 플레이하기 위해 고를 수 있는 영웅들을 제공하는 저장소
// 영웅 저장소
public interface CrudRepository<T> {
    // 영웅 이름을 가지고 영웅을 찾아서 반환
    public abstract T findHeroByName(String name);

    public abstract void create(T hero);

    // default = Fallback : 인터페이스의 추상 메서드를 따로 구현하지 않았을 때 실행할 "구린" 대체재
    default T update(T hero) {
        throw new RuntimeException("update 메서드는 구현되지 않았습니다. - 이건 인터페이스 내 디폴트 메서드입니다.");
    }

    public abstract void delete(String name);

//    default void delete(String name) {
//        throw new RuntimeException("delete 메서드는 구현되지 않았습니다. - 이건 인터페이스 내 디폴트 메서드입니다.");
//    }

    /*
     *      Failfast : 잘못된 상황에서 뭘 하려고하지 말고 바로 에러를 발생시켜서 -> 적절한 대응을 할 수 있게 함
     *      Failover : 잘못된 상황에서 "수평적"인 다른 대안으로 대체 실행 = 90% 성능 -> 90% 성능 대체 : "수평적"
     *      Fallback : 잘못된 상황에서 "수직적"으로 구힌 대안으로 대체 실행 = 90% 성능 -> 10% 성능 대체 : "수직적"
     */
}
