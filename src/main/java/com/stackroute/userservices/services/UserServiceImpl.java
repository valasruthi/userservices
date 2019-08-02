package com.stackroute.userservices.services;

import com.stackroute.userservices.domain.User;
import com.stackroute.userservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
 private UserRepository userRepository;

 public UserServiceImpl(UserRepository userRepository){
   this.userRepository=userRepository;
 }
  @Override
  public User saveUser(User user) {
   User savedUser=userRepository.save(user);
   return savedUser;
  }

  @Override
  public User getUserById(int id) {
     User retrivedUser=userRepository.findById(id).get();
     return retrivedUser;
  }


}
