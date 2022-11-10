import java.lang.StringBuilder;

public class StringDrink {

    private String text;

    StringDrink(String str){
        text = str;
    }

    StringDrink(StringDrink another){
        this.text = another.text;
    }

    public String getText(){
        return text;
    }
    public void setText(String txt){
        text = txt;
    }

}
