package com.singidunum.isa_be.repositories;

import com.singidunum.isa_be.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
