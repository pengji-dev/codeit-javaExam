package com.codeit.javaExam.member;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

//@AllArgsConstructor       // 클래스 상속 시, @AllArgsConstructor 사용 불가 -> 자식 클래스 내부에서 부모 클래스의 필드까지 포함하는 생성자를 자동으로 생성하면 super()를 올바르게 호출하지 못한다.
public class Administrator extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Administrator(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    public String toString() {
        return String.format(
                "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocatedAt=%s)",
                super.getId(), super.getName(), super.getAge(), super.getEmail(), this.role, this.allocatedAt
        );
    }
}
