package com.spring.mvc.controller01;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// data 어노테이션은 순환참조 문제가 있어 쓰지 않는 것을 권고함
@Getter
@Setter
@ToString
@NoArgsConstructor // 디폴트 생성자
public class DogDTO {
    private String name;
    private int age;
    private String kind;
}
