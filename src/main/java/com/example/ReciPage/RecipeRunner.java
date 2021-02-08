package com.example.ReciPage;

import com.example.ReciPage.Model.Recipe;
import com.example.ReciPage.Model.STEP;
import com.example.ReciPage.Repository.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RecipeRunner implements CommandLineRunner{
    @Autowired
    private RecipeRepository recipeRepository;

   

   @Override
    public void run(String...args) throws Exception{
      
        Recipe test = new Recipe(
          /*NAME:*/   "hello",
         /*DESCRIPTION:*/   "this", 
        /*STEPS:*/    STEP.c, 
         /*TOTAL STEPS:*/   "a ", 
        /*PRICE:*/    "test",
          /*TIME:*/   ".");
        recipeRepository.save(test);
    }
}
