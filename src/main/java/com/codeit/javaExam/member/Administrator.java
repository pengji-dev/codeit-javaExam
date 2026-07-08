package com.codeit.javaExam.member;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

public class Administrator extends Member {
    public static String ADMINISTRATOR_TO_STRING_FORMAT = "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocatedAt=%s)";
    // Static 필드 : 객체(인스턴스) 없이 사용 가능한 필드(= 정적 필드)
    // -> final을 사용하지 않으면 수정의 위험이 있음

    private String role;
    private LocalDate allocatedAt;

    public Administrator(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    public String toString() {
        return String.format(
                ADMINISTRATOR_TO_STRING_FORMAT,
                super.getId(), super.getName(), super.getAge(), super.getEmail(), this.role, this.allocatedAt
        );
    }
}
