import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;
    public void add(Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException(" Такой рецепт уже есть");
        }
        recipes.add(recipe);
    }
    public void remove(Product product) {
        recipes.remove(product);
    }
}

