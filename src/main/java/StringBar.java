import java.util.ArrayList;

public class StringBar extends Bar{
    private boolean bool = false;

    StringBar(){
        observers = new ArrayList<>();
    }

    @Override
    public boolean isHappyHour() {
        return bool;
    }

    @Override
    public void startHappyHour() {
        bool = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        bool = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
