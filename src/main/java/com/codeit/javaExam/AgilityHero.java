package com.codeit.javaExam;

public class AgilityHero implements Hero {
    @Override
    public void attack() {
        System.out.println("Fast Attack");
    }

    @Override
    public void ultimate() {
        System.out.println("Magic Attack");
    }
}
