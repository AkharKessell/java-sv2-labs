package introexceptionreadfiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testRecipe() {
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));
        List<String> result = Arrays.asList(
                "liszt",
                "margarin",
                "kristálycukor",
                "tojás",
                "citrom",
                "sütőpor",
                "vanillincukor",
                "tejföl",
                "alma",
                "fahéj");
        assertEquals(result, recipe.getIngredients());
    }

    @Test
    public void testWrongPath() {
        exception.expect(IllegalStateException.class);
        exception.expectMessage("File not found.");
        new Recipe().addIngredients(Paths.get("src/test/resources/r10ecipe.txt"));
    }
}