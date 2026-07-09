package com.codeit.javaExam;

public class StrengthHero implements Hero {
    @Override
    public void attack() {
        System.out.println("Bash Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Berserker");
    }
}
