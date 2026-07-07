package com.codeit.javaExam.member;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

//@ToString           // 클래스 상속 시, 자식 클래스에 @ToString 사용하면 자식 클래스의 필드만 출력된다.
@ToString(callSuper = true)     // callSuper 옵션 : 클래스 상속 시, 자식 클래스의 필드와 상속받은 부모 클래스의 필드 모두 출력된다.
public class Administrator extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Administrator(Integer id, String name, String role) {
        super(id, name);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

//    public String toString() {
//        return String.format(
//                "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocatedAt=%s)",
//                super.getId(), super.getName(), super.getAge(), super.getEmail(), this.role, this.allocatedAt
//        );
//    }
}
