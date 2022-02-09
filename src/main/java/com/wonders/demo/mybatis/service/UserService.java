package com.wonders.demo.mybatis.service;


import com.wonders.demo.mybatis.entity.User;
import com.wonders.demo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: zj
 * @Date: 2022-02-09 11:39
 * @Description:
 * @Version: V1.0
 */
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserInfo(int id) {
		return userMapper.getUserInfo(id);
	}


	public int deleteById(int id) {
		return userMapper.deleteById(id);
	}

	public int Update(User user) {
		return userMapper.update(user);
	}

	public User save(User user) {
		int save = userMapper.save(user);
		return user;
	}

	public List<User> selectAll() {
		return userMapper.selectAll();
	}
}
