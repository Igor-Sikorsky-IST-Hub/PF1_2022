public class task_5 {
    public static void main(String[] args) {
    StrToInt first = new StrToInt("10101");
    first.printResults();
    StrToInt second = new StrToInt("10101001");
    second.printResults();
    StrToInt third = new StrToInt("");
    third.printResults();
    }
}
  class StrToInt {
      String str;

      StrToInt(String s) {
          this.str = s;
      }

      public void checking() {
          if (str.isEmpty()) {
              throw new IllegalArgumentException("the string is empty");
          }
      }
      public String getStr(){
          return str;
      }

      public int binaryStringToInt() {
          int number = 0;
          int len = str.length();
          int index = 0;
          int first = 0;
          for (int i = len - 1; i >= 0; i--) {
              char firsting = str.charAt(index);
              if (firsting == '0') first = 0;
              else first = 1;
              number = number + first * (int) Math.pow(2, i);
              index++;
          }
          return number;
      }

      public int easy() {
          int number = Integer.parseInt(str, 2);
          return number;
      }
    public   void printResults(){
        try {
            checking();
            System.out.println(" The binary String: " + getStr());
            System.out.print(" First method =");
            System.out.println(binaryStringToInt());
            System.out.print(" Second method = ");
            System.out.println(easy());
            System.out.println("-----------------------------------------");

        }
        catch (IllegalArgumentException e){
            System.out.println("Exception!!!" + e.getMessage());
        }
    }
}
