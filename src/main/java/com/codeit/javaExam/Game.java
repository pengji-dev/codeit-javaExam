package com.codeit.javaExam;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Game {
    String[] name;
    int count;

//    public Game(String[] name, int count) {
//        this.name = name;
//        this.count = count;
//    }

    public String[] play() {
        System.out.println("--- 플레이어들 ---");

        for (String each : this.name) {
            System.out.println(each);
        }

        System.out.println(count);
        System.out.println("--- 게임끝 ---");

        return new String[]{"Aaron", "5시 53분 30초", "아이템 10개 사용"};
    }
}
