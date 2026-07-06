package com.codeit.javaExam.member;

import java.time.LocalDate;

public class Administrator extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Administrator(String name, String email, String role) {
//        this. this -> Administrator 클래스를 의미(자기 자신)
//        super. super -> Administrator 클래스가 상속받은 Member 클래스를 의미(부모 클래스, 상위 클래스)
        super(name, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)", super.id, super.name, super.age, super.email, this.role, this.allocatedAt);
//        부모 클래스인 Member 클래스의 필드는 private으로 은닉화하였기 때문에, 접근 불가능(빌드 에러 발생)
    }

    public String getRole() {
        return role;
    }
}
