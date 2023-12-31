package io.github.ismaelE77.tacocloud.tacos;

import jakarta.validation.constraints.Size;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@Table
public class Taco {
    @Id
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min=5,message = "Name must be at least 5 characters long")
    private String name;
    @NotNull

    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient taco) {
        this.ingredients.add(new IngredientRef(taco.getId()));
    }

    public Taco() {

    }
}
