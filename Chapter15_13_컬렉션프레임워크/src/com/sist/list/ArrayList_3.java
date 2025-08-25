package com.sist.list;
import java.util.*;
import com.sist.database.*;
public class ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpDAO dao=new EmpDAO();
        ArrayList list=dao.empListData();
        for(int i=0;i<list.size();i++)
        {
        	EmpVO vo=(EmpVO)list.get(i);
        	System.out.println(
        	  vo.getEmpno()+" "
        	  +vo.getEname()+" "
        	  +vo.getJob()+" "
        	  +vo.getSal()
            );
        }
	}

}
