package com.sist.dao;

import lombok.Data;

@Data
public class EmpVO {
   private int empno;
   private String ename;
   private String job;
   private String hiredate;
   private int sal;
   private int deptno;
}
