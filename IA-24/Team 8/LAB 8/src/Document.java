package lab8;

public class Document {
    String name;
    int size;

    @Override
    public String toString(){
        return "Name: " + name + ", Size: " + size;
    }

    public Document() {
        name = "New file";
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
