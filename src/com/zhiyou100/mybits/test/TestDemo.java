package com.zhiyou100.mybits.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhiyou100.mybits.mapper.StaffMapper;
import com.zhiyou100.mybits.mapper.UserMapper;
import com.zhiyou100.mybits.model.Query;
import com.zhiyou100.mybits.model.Staff;



public class TestDemo {
	
	
	
	
	

	@Test
	public void test01() throws IOException {
		
		//创建构建工厂对象
	  SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
	    //构建工厂对象读取配置文件,生成工厂
	  SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
       SqlSession session = factory.openSession();	     
	  
        UserMapper mapper = session.getMapper(UserMapper.class);
	           
	     System.out.println(mapper.findAllUserById(1));
	}
	
	@Test
	public void test02() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		System.out.println(mapper.findAllSaffWithProductById(1));
	}
	
	@Test
	public void test03() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		System.out.println(mapper.findSaffByProductId(2));
	}
	
	@Test
	public void test04() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		
		UserMapper mapper = session.getMapper(UserMapper.class);
		
		System.out.println(mapper.findSaffByProductallId(3));
	}
	@Test
	public void test05() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
	    StaffMapper mapper = session.getMapper(StaffMapper.class);
		 
	    System.out.println(mapper.findAllStaff());
	}
	@Test
	public void test06() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		Staff st = new Staff();
		st.setName("师");
		Query q = new Query();
		q.setSta(st);
		System.out.println(mapper.findStaffByQuery(q));
		
	}
	
	@Test
	public void test07() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		
		System.out.println(mapper.findStaffCount());
		
	}
	@Test
	public void test08() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		
		System.out.println(mapper.findStaffName(6));
		
	}
	@Test
	public void test09() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		
		Staff st = new Staff();
		//st.setAddress("河");
		st.setName("师");
		 
		 
		 System.out.println(mapper.findStaffByNameAndAddress(st));
	}
	@Test
	public void test10() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		
		Query q = new Query();
		Integer[] in = {1,3,6};
		q.setIntegers(in);
		System.out.println(mapper.findStaffById(q));
	
	}
	@Test
	public void test11() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		
		List<Integer> q = new ArrayList<>();
		q.add(3);
		q.add(6);
		q.add(9);
		System.out.println(mapper.findStaffById02(q));
		
	}
	
	@Test
	public void test12() throws IOException {
		
		//创建构建工厂对象
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//构建工厂对象读取配置文件,生成工厂
		SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("sqlMapConfig.xml"));
		SqlSession session = factory.openSession();	     
		StaffMapper mapper = session.getMapper(StaffMapper.class);
		Integer[] in = {1,3,6};
		
		System.out.println(mapper.findStaffById03(in));
		
	}
	
	
	
	
	
	
	
}

