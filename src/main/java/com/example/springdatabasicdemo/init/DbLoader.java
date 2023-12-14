package com.example.springdatabasicdemo.init;

import jdk.internal.javac.PreviewFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.example.springdatabasicdemo.models.User;
import com.example.springdatabasicdemo.models.Recipe;
import com.example.springdatabasicdemo.models.Diet;
import com.example.springdatabasicdemo.repositories.UserRepository;
import com.example.springdatabasicdemo.repositories.RecipeRepository;
import com.example.springdatabasicdemo.repositories.DietRepository;

import java.util.Optional;
@Component
@DependsOn("dataSource")
public class DbLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private DietRepository dietRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Faker faker = new Faker();

        for(int i = 0; i < 100; i++) {

            User user = new User();

            user.setLogin(faker.name().username());
            user.setPassword(faker.internet().password());
            user.setGender(faker.options().option("Male", "Female"));

            user.setImadeUrl(faker.internet().url());

            user.setHeight(faker.number().numberBetween(140, 200));
            user.setWeight(faker.number().numberBetween(50, 100));
            user.setAge(faker.number().numberBetween(18, 80));
            user.setCaloriesLim(faker.number().numberBetween(1500, 3000));

            User savedUser = userRepository.save(user);

    }
   }
//    private Recipe getRandomRecipe() {
//        Long recipesCount = recipeRepository.count();
//
//        Long randomId = Faker.number().numberBetween(1, recipesCount);
//        Optional<Recipe> recipe = recipeRepository.findById(randomId);
//        return recipe.get();
//    }


}

//
//
//      @Override
//      public void run(ApplicationArguments args) throws Exception {
//
//      }
////    public void run(ApplicationArguments args) throws Exception {
////
////        Faker faker = new Faker();
////
////        for(int i = 0; i < 100; i++) {
////
////            User user = new User();
////
////            user.setLogin(faker.name().username());
////            user.setPassword(faker.internet().password());
////            user.setGender(faker.options().option("Male", "Female"));
////
////            user.setImadeUrl(faker.internet().url());
////
////            user.setHeight(faker.number().numberBetween(160, 200));
////            user.setWeight(faker.number().numberBetween(50, 100));
////            user.setAge(faker.number().numberBetween(18, 80));
////            user.setCaloriesLim(faker.number().numberBetween(1500, 4000));
////
////            User savedUser = userRepository.save(user);
////
//////            Recipe randomRecipe = getRandomRecipe();
//////            savedUser.setRecipe(randomRecipe);
//////
//////            Diet randomDiet = getRandomDiet();
//////            savedUser.setFeaturedDiets(randomDiet);
////
////        }
////    }
////
////
//////

//
//}