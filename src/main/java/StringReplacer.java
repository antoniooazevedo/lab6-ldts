public class StringReplacer implements StringTransformer{

    private Character toReplace;
    private Character replacement;

    StringReplacer(Character a, Character b){
        toReplace = a;
        replacement = b;
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < builder.length(); i++){
            if (builder.charAt(i) == toReplace){
                result.append(replacement);
            }
            else result.append(builder.charAt(i));
        }

        drink.setText(result.toString());
    }
    public void undo(StringDrink drink){
        StringBuilder builder = new StringBuilder(drink.getText());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < builder.length(); i++){
            if (builder.charAt(i) == replacement){
                result.append(toReplace);
            }
            else result.append(builder.charAt(i));
        }

        drink.setText(result.toString());
    }
}
