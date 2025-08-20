package com.sist.exception;

import lombok.Data;
// 사원 데이터형 => 사용자 정의 데이터형 
@Data
public class EmpVO {
   private int empno; // 사번 
   private String ename;
   private String job; // 직위
   private int sal; // 급여
   private int comm; // 성과급 
   private int deptno; // 부서번호
}
