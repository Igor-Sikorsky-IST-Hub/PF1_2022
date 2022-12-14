package lab8;

public class TextDocument extends Document{

    String info;
    String text;


    public TextDocument(String name, String info, String text ){
        super.name = name;
        this.size = text.toCharArray().length *2;
        this.text = text;
        this.info = info;

    }
    public TextDocument(){

    }
    @Override
    public String toString(){
        return "Name: " + name + ", Size: " + size + ", Contents: " + info + ", Text: " + text;
    }
}
