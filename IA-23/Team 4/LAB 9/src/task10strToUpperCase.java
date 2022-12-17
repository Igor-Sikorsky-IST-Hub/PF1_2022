public class task10strToUpperCase {
    String s;
    task10strToUpperCase(String str){
        this.s = str;
    }
    public void illegalArguments(){
        if (s.isEmpty()){
            throw new IllegalArgumentException("Цей рядок порожній!");
        }

    }
    public String getStr(){
        return s;
    }
    public String stringToUpperCase(){
        String[] words = s.split(" ");
        String result = "";
        String s1;
        boolean y;
        for (int i=0;i<words.length;i+=1){
            s1 = words[i];

            if ((s1.matches("\\w+[0-9]+"))|(s1.matches("[0-9]+"))){
                result += s1+" ";}
            else result+=s1.toUpperCase()+" ";
        }
        return result;
    }


    public void printResults(){
        try {
            illegalArguments();
            System.out.println("Даний рядок: " + getStr());
            System.out.println("Змінений рядок: ");
            System.out.println(stringToUpperCase());
        }
        catch (IllegalArgumentException e){
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}

