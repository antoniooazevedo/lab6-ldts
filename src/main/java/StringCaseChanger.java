import java.lang.StringBuilder;
import java.lang.Character;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < builder.length(); i++){
            Character ch = builder.charAt(i);

            if (Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            else{
                ch = Character.toUpperCase(ch);
            }

            result.append(ch);
        }

        drink.setText((result.toString()));
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
