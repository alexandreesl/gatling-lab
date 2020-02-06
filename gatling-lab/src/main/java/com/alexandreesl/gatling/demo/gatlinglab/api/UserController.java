package com.alexandreesl.gatling.demo.gatlinglab.api;

import com.alexandreesl.gatling.demo.gatlinglab.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping(path = "/{id}")
  public User get(@PathVariable("id") long id) {
    return new User(1, "ale", 5511983295458L);
  }
}
