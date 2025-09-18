package com.rhna.crudmysql.repository;

import com.rhna.crudmysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Truyền vào user and id
public interface UserRepository extends JpaRepository<User,Long > {
}
