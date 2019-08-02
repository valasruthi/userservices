package com.stackroute.userservices.services;

import com.stackroute.userservices.domain.User;

public interface UserService {
  public User saveUser(User user);
  public User getUserById(int id);


}
