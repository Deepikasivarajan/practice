package com.library.service;

import com.library.model.User;

public interface UserService {

	User addUser(User user);

	User findByUsernameAndPassword(String userName, String password);

}
