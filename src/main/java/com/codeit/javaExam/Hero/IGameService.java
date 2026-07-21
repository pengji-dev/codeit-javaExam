package com.codeit.javaExam.Hero;

// abstract (추상) 인터페이스 : 메서드들은 내부 로직이 구현되어 있지 않고, 구현되기를 기다리고 있음
// GameService 인터페이스 : 앞서 고른 영웅 Hero 통해 게임 플레이
public interface IGameService {
    public abstract void play();
}
