package com.spring.mvc.controller01;

import lombok.Data;

// LOMBOK 사용법
@Data // 자동으로 getter, setter, 생성자 등을 만들어준다.
public class NotebookDTO {
    // 커맨드 객체 패턴으로 컨트롤러의 파라미터로 처리하는 경우
    // 반드시 세터와 기본생성자가 만들어져 있어야 작동하는데
    // 롬복을 이용해 생성해둔 상태임
    private String modelName; // 노트북 모델 명 변수
    private int price; // 노트북 가격 변수
    private int ssd; // 노트북 용량 변수
    private int ram; // 노트북 램 변수

//    @Override
//    public String toString(){
//        return "재정의 toString() 메서드";
//    }
}
