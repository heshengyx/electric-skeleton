package com.grgbanking.electric.service;

import java.util.List;

import com.grgbanking.electric.entity.User;

public interface IUserService {

	void save(User user);
	void saveBatch(List<User> users);
	User getUserByAccount(String account);
}
