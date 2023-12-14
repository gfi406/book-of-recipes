package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{

}
