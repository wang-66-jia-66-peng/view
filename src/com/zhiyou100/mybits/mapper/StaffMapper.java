package com.zhiyou100.mybits.mapper;

import java.util.List;

import com.zhiyou100.mybits.model.Query;
import com.zhiyou100.mybits.model.Staff;


public interface StaffMapper {
   
    List<Staff> findAllStaff();
	
    List<Staff>  findStaffByQuery(Query qr);
   
    int  findStaffCount();
    
    String findStaffName(int i);

   List<Staff> findStaffByNameAndAddress(Staff sa);
    
   List<Staff>  findStaffById(Query q);
  
   List<Staff>  findStaffById02(List<Integer> q);
  
   List<Staff>  findStaffById03(Integer[] q);


}
