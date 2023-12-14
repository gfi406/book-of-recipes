package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipieRepositories extends JpaRepository<Recipe,Long> {
}
