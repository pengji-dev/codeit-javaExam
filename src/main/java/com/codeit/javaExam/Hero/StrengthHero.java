package com.codeit.javaExam.Hero;

// Concrete 구현체 = class < implements Hero
public class StrengthHero extends BasicHero {
    public StrengthHero(String name) {
        super(name);
    }

    @Override
    // public abstract void attack();
    // - public interface Hero에 있던 추상 메서드를 구체 메서드로 구현
    public void attack() {
        System.out.println("Bash Attack");
    }

    @Override
    // public abstract void attack();
    // - public interface Hero에 있던 추상 메서드를 구체 메서드로 구현
    public void ultimate() {
        System.out.println("Berserker");
    }

    // 인터페이스를 implements로 받았다고 꼭 인터페이스에 있는 추상 메서드들에 대해서만 구현하지 않아도 된다.
    public void additional() {
        System.out.println("Taunt");
    }
}
