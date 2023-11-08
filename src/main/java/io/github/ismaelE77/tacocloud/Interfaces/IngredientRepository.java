package io.github.ismaelE77.tacocloud.Interfaces;

import java.util.Optional;
import  io.github.ismaelE77.tacocloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}
