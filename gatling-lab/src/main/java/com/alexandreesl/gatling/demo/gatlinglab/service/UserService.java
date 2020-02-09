package com.alexandreesl.gatling.demo.gatlinglab.service;

import com.alexandreesl.gatling.demo.gatlinglab.model.Users;
import com.alexandreesl.gatling.demo.gatlinglab.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired private UserRepository userRepository;

  public Users create(Users user) {
    return userRepository.save(user);
  }

  public Users update(Users user) {
    return userRepository.save(user);
  }

  public void delete(long id) {
    final var user = userRepository.findById(id);

    user.ifPresent(value -> userRepository.delete(value));
  }

  public Optional<Users> search(long id) {
    return userRepository.findById(id);
  }
}
