package com.sist.database;
import java.util.*; // 사원 정보 

import lombok.Data;
// 사원 한명에 대한 데이터를 저장하는 데이터형 => ~VO, ~DTO
@Data
public class EmpVO {
   private int empno; // 사번 
   private String ename; // 이름 
   private String job; //직위
   private Date hiredate; // 입사일 
   private int sal; // 급여 
   private int comm; // 상과급 
   private int deptno; // 부서번호 
}
