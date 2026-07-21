package com.codeit.javaExam.Hero;

import lombok.RequiredArgsConstructor;

// Concrete 구현 클래스
// OneCoinGameService < GameService 인터페이스 내 구현되지 않는 추상 메서드를 구현
@RequiredArgsConstructor
public class OneCoinIGameService implements IGameService {
    // Hero 인터페이스 타입을 클래스 필드로 사용하여 인터페이스의 다형성 덕분에 AgilityHero 구현 클래스이든 StrengthHero 구현 클래스이든 들어갈 수 있다.
    private final Hero hero;

    @Override
    public void play() {
        System.out.println("--- Game Start ---");
        this.hero.attack();
        this.hero.ultimate();
        System.out.println("--- Game Stop ---");
    }
}
