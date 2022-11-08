import java.util.List;

public class StringRecipe{

    List<StringTransformer> list;

    StringRecipe(List<StringTransformer> l){
        list = l;
    }

    public void mix(StringDrink drink){
        for (StringTransformer t: list){
            t.execute(drink);
        }
    }


}
