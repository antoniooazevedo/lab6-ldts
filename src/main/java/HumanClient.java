public class HumanClient implements Client{
    StringDrink _drink;
    StringRecipe _recipe;
    StringBar _bar;

    private boolean _isHappyHour = false;

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        _drink = drink;
        _recipe = recipe;
        _bar = bar;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        _isHappyHour = true;
    }

    @Override
    public void happyHourEnded(Bar bar) {
        _isHappyHour = false;
    }
}
