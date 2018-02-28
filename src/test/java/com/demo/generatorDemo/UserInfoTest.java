package com.demo.generatorDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.Application;
import com.alibaba.fastjson.JSONObject;
import com.dao.UserInfoMapper;
import com.domain.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
//@WebAppConfiguration
public class UserInfoTest {
	
	@Autowired
	UserInfoMapper userInfoMapper;
	
	@Test
	public void deleteByPrimaryKey() {
		Integer uid = 1;
//		System.out.println(userInfoService.deleteByPrimaryKey(uid));
		System.out.println(userInfoMapper.deleteByPrimaryKey(uid));
	}

	@Test
	public void insert() {
		UserInfo record = new UserInfo();
		System.out.println(userInfoMapper.insert(record));
	}

	@Test
	public void insertSelective() {
		UserInfo record = new UserInfo();
		System.out.println(userInfoMapper.insertSelective(record));
	}

	@Test
	public void selectByPrimaryKey() {
		Integer uid = 1;
//		System.out.println(JSONObject.toJSONString(userInfoService.selectByPrimaryKey(uid)));
		System.out.println(JSONObject.toJSONString(userInfoMapper.selectByPrimaryKey(uid)));
	}

	@Test
	public void updateByPrimaryKeySelective() {
		UserInfo record = new UserInfo();
		System.out.println(userInfoMapper.updateByPrimaryKeySelective(record));
	}

	@Test
	public void updateByPrimaryKey() {
		UserInfo record = new UserInfo();
		System.out.println(userInfoMapper.updateByPrimaryKey(record));
	}

}
