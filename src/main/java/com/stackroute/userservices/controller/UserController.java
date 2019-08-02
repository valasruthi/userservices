package com.stackroute.userservices.controller;

import com.stackroute.userservices.domain.User;
import com.stackroute.userservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class UserController {
 private UserService userService;

  public UserController() {
  }
  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }
  @PostMapping("user")
  public ResponseEntity<?> saveUser(@RequestBody User user){
  User savedUser=userService.saveUser(user);
   return new ResponseEntity<>(savedUser, HttpStatus.OK);
   }

@GetMapping("user/{id}")
  public ResponseEntity<?> getUserById(@PathVariable int id) {
    System.out.println(id);
  User userDetails=userService.getUserById(id);
  return new ResponseEntity<>(userDetails,HttpStatus.OK);


  }
}
