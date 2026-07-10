package com.codeit.javaExam;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
public class Member {
    final String citizen;
    @Setter
    String name;
    @Setter
    int age;

//    public Member(String citizen, String name, int age) {
//        this.citizen = citizen;
//        this.name = name;
//        this.age = age;
//    }

//    public Member(String citizen) {
//        this.citizen = citizen;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public void birthday() {
        this.age += 1;
    }

    public String toString() {
        return "Member(citizen=" + this.citizen + ", name=" + this.name + ", age=" + this.age + ")";
    }
}
