package com.alexandreesl.gatling.demo.gatlinglab.repository;

import com.alexandreesl.gatling.demo.gatlinglab.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {}
