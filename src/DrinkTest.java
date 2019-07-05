public class DrinkTest {
    public static void main(String[] args) {

        Drink margarita = new Drink();
        margarita.name = "Margarita";
        margarita.price = 12.5;
        margarita.isAlcohol = true;

        Ingredient ingredient1 = new Ingredient();
        ingredient1.name = "tequila";
        ingredient1.quantity = 40;
        margarita.ingredient1 = ingredient1;

        Ingredient ingredient2 = new Ingredient();
        ingredient2.name = "triple sec";
        ingredient2.quantity = 20;
        margarita.ingredient2 = ingredient2;

        Ingredient ingredient3 = new Ingredient();
        ingredient3.name = "lemon juice";
        ingredient3.quantity = 15;
        margarita.ingredient3 = ingredient3;

        int quantitySum = margarita.ingredient1.quantity + margarita.ingredient2.quantity + margarita.ingredient3.quantity;

        System.out.println(margarita.name + ", ma alkohol: " + margarita.isAlcohol + ", kosztuje: " + margarita.price + " i ma " + quantitySum + " ml." );


    }
}
