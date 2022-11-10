public class ImpatientStrategy implements OrderingStrategy{
    private boolean happy = false;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        recipe.mix(drink);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        happy = true;
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happy = false;
    }
}
