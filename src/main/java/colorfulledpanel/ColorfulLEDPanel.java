package colorfulledpanel;

import colorfulledpanel.LEDpanel.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

import java.awt.*;

@ModEntry
public class ColorfulLEDPanel {

        public void init() {
                // Register out objects

                ObjectRegistry.registerObject("ledpanelblack", new ColorfulLEDPanelObject(new Color(0, 0, 0),
                                "ledpanelblack"), 2, true);
                ObjectRegistry.registerObject("ledpanelred",
                                new ColorfulLEDPanelObject(new Color(255, 0, 0), "ledpanelred"), 2, true);
                ObjectRegistry.registerObject("ledpanelorange",
                                new ColorfulLEDPanelObject(new Color(255, 128, 0), "ledpanelorange"), 2, true);
                ObjectRegistry.registerObject("ledpanelyellow",
                                new ColorfulLEDPanelObject(new Color(255, 255, 0), "ledpanelyellow"), 2, true);
                ObjectRegistry.registerObject("ledpanelblue",
                                new ColorfulLEDPanelObject(new Color(0, 0, 255), "ledpanelblue"), 2, true);
                ObjectRegistry.registerObject("ledpanelgreen", new ColorfulLEDPanelObject(new Color(0, 255, 0),
                                "ledpanelgreen"), 2, true);
                ObjectRegistry.registerObject("ledpanelpurple",
                                new ColorfulLEDPanelObject(new Color(128, 0, 255), "ledpanelpurple"), 2, true);
                ObjectRegistry.registerObject("ledpanelpink", new ColorfulLEDPanelObject(new Color(255, 0, 128),
                                "ledpanelpink"), 2, true);
                ObjectRegistry.registerObject("ledpanelgray",
                                new ColorfulLEDPanelObject(new Color(128, 128, 128), "ledpanelgray"), 2, true);
                ObjectRegistry.registerObject("ledpanelbrown",
                                new ColorfulLEDPanelObject(new Color(128, 64, 0), "ledpanelbrown"), 2, true);
                ObjectRegistry.registerObject("ledpanelcyan",
                                new ColorfulLEDPanelObject(new Color(0, 255, 255), "ledpanelcyan"), 2, true);
                ObjectRegistry.registerObject("ledpanelteal",
                                new ColorfulLEDPanelObject(new Color(0, 128, 128), "ledpanelteal"), 2, true);
        }

        public void postInit() {
                // Add recipes
                Recipes.registerModRecipe(new Recipe(
                                "ledpanelblack",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanel"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelred",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelblack"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelorange",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelred"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelyellow",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelorange"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelblue",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelyellow"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelgreen",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelblue"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelpurple",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelgreen"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelpink",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelpurple"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelgray",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelpink"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelbrown",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelgray"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelcyan",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelbrown"));

                Recipes.registerModRecipe(new Recipe(
                                "ledpanelteal",
                                1,
                                RecipeTechRegistry.WORKSTATION,
                                new Ingredient[] {
                                                new Ingredient("ledpanel", 1)
                                }).showAfter("ledpanelcyan"));
        }

}
