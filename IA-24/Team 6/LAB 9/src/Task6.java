import java.lang.Math;
public class Task6 {
	public static void main(String[] args) {
		printResults("777");
		printResults("1412");
		printResults("551");
		printResults("841");
		printResults("Wee-wee");
		printResults("004");
	}
	public static int octStringToInt(String s) {
		String[] norm = new String[] {"0","1","2","3","4","5","6","7"};
		String[] numbers = s.split("");
		for(String i:numbers) {
			byte k = 0;
			for(String j:norm) {
				if(j.equals(i)) {
					k+=1;
				}
				
			}
			if(k==0) {
				throw new IllegalArgumentException("Недопустимі значення");
			}
		}
		int res = 0;
		for(int i = 0; i<numbers.length; i++) {
			res += Byte.valueOf(numbers[numbers.length-1-i]) * Math.pow(8, i);
		}
		return res;
	}
    static void printResults(String s) {
        System.out.println("Аргумент: " + s);
        try {
        	System.out.println("Результат: " + octStringToInt(s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
