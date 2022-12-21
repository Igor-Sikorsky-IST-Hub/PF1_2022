public class task_11 {
    public static void main(String[] args) {
        CapsToLittle first = new CapsToLittle("Today i WAS doing my 9-th lab by pROGrammIng");
        CapsToLittle second =  new CapsToLittle("");
        first.printResullts();
        second.printResullts();
    }
}
class  CapsToLittle{
    String str;
    CapsToLittle (String t){
        this.str = t;
    }
    public void checking(){
        if (str.isEmpty()){
            throw new IllegalArgumentException(" The string is empty");
        }

    }
    public String getStr(){
        return str;
    }
    public String Caps_litters_to_little(){
            str = str.toLowerCase();
            return str;
        }
        public void printResullts(){
        try {
            checking();
            System.out.println("The started function:" + getStr());
            System.out.println(" The changed:::");
            System.out.println(Caps_litters_to_little());
            System.out.println("--------------------------------------------");
        }
        catch (IllegalArgumentException e){
            System.out.println("Change the string!!!" + e.getMessage());
        }
        }
    }

