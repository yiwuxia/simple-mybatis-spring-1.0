package com.jin.mybatis0115;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yihaomen.mybatis.model.User;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionTemplate tem= ctx.getBean(SqlSessionTemplate.class);
		String id ="com.yihaomen.mybatis.models.UserMapper"+"."+"selectUserByID";
		User user= tem.selectOne(id,2);
		System.out.println(user.toString());
		
	}
	
}
