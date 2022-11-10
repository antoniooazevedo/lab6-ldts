import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> list;

    StringTransformerGroup(List<StringTransformer> l){
        list = l;
    }

    public void execute(StringDrink drink){
        for (StringTransformer t: list){
            t.execute(drink);
        }
    }

}
