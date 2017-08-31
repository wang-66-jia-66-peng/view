package com.zhiyou100.mybits.mapper;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.zhiyou100.mybits.model.User;
import com.zhiyou100.mybits.model.Product;
import com.zhiyou100.mybits.model.Staff;


@Repository
public interface UserMapper {
  /*
   * 方法名和配置文件的id一致
   * 方法的返回值或对应的标签的resultTyp一致
   * 方法的参数和parameterType一致
   * namespace和接口的全名称一致
   * 
   */
	 List<User> findAllUserById(int i);
	
	 List<Staff> findAllSaffWithProductById(int i);
	 
	 List<Product> findSaffByProductId(int i);
	
	 List<Product> findSaffByProductallId(int i);
	 
	 
	 
}
