package com.codeit.javaExam;

import com.codeit.javaExam.Hero.Hero;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Player {
    private final int id;
    private final String name;
    private final Side side;
    private final int kill;
    private final int assist;
    private final int death;
    private final Hero pickedHero;
}
