package com.alexandreesl.gatling.demo.gatlinglab.api;

import com.alexandreesl.gatling.demo.gatlinglab.model.Users;
import com.alexandreesl.gatling.demo.gatlinglab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired private UserService userService;

  @GetMapping(path = "/{id}")
  public Users get(@PathVariable("id") long id) {

    return userService.search(id).orElse(new Users());
  }

  @PostMapping(path = "/")
  public Users post(@RequestBody Users user) {
    return userService.create(user);
  }

  @PatchMapping(path = "/")
  public Users patch(@RequestBody Users user) {
    return userService.update(user);
  }

  @DeleteMapping(path = "/{id}")
  public void delete(@PathVariable("id") long id) {
    userService.delete(id);
  }
}
