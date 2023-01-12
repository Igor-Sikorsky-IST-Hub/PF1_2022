public class Text_Doc extends Document{
    String info;
    String text;
    public Text_Doc(String name, String info, String text ){
        super.name = name;
        this.size = text.toCharArray().length *2;
        this.text = text;
        this.info = info;

    }
    public Text_Doc(){

    }
    @Override
    public String toString(){
        return "Ім'я: " + name + ", Розмір: " + size + ", Зміст: " + info + ", Текст: " + text;
    }
}