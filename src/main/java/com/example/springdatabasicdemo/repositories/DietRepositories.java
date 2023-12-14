package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Diet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietRepositories  extends JpaRepository<Diet,Long>
{

}
