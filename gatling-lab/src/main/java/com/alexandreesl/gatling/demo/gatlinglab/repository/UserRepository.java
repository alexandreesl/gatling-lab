package com.alexandreesl.gatling.demo.gatlinglab.repository;

import com.alexandreesl.gatling.demo.gatlinglab.model.Users;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<Users, Long> {

  @Query("select id, name, phone from users where upper(name) = upper(:nameParam) ")
  List<Users> findByName(@Param("nameParam") String name);
}
