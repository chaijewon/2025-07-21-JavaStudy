package com.sist.ast;

import lombok.Data;

// 데이터형 클래스 
// 시큐어 코딩
@Data 
public class Music {
  private int rank;
  private String poster;
  private String title;
  private String singer;
  private String album;
  private String state;
  private int idcrement;
  // 캡슐화 => 데이터 보호 
  // 데이터를 은닉화 
  // 기능 부여 => 변수 (메모리 저장 , 수정) , 메모리에서 데이터 가지고 오기
  // => 메소드 처리    setter                 getter
  
}
