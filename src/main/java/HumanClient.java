public class HumanClient implements Client{
    StringDrink _drink;
    StringRecipe _recipe;
    StringBar _bar;

    OrderingStrategy _strategy;

    private boolean _isHappyHour = false;

    HumanClient(OrderingStrategy strategy){
        _strategy = strategy;
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        _drink = drink;
        _recipe = recipe;
        _bar = bar;
        _strategy.wants(drink,recipe,bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        _isHappyHour = true;
        _strategy.happyHourStarted(_bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        _isHappyHour = false;
        _strategy.happyHourEnded(_bar);
    }
}
