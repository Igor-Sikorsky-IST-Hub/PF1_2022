public class Document  {
    String name;
    int size;
    @Override
    public String toString(){
        return "Ім'я: " + name + ", Розмір: " + size;
    }
    public Document() {
        name = "Новий файл";
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Document(String name, int size){
        this.name = name;
        this.size = size;
    }
}