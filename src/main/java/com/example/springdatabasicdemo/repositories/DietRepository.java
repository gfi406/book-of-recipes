package com.example.springdatabasicdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatabasicdemo.models.Diet;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepository extends JpaRepository<Diet, Long> {

}