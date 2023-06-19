package com.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.etities.User;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String> {

}
