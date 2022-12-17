public class Task7 {
	public static void main(String[] args) {
		printResults("The user with the nickname koala757677 this month left 3 times more comments than the user "
				+ "with the nickname croco181dile181920 4 months ago");
		printResults("Hello 2023, HAPPPY NEW YEAR!!!");
		printResults("The user TurboVoid322 is so strong");
	}
	public static int octStringToInt(String s) {
		String[] numbers = new String[] {"0","1","2","3","4","5","6","7","8","9"};
		String[] words = s.split(" ");
		int counter = 0;
		for(String i:words) {
			byte k = 0;
			for(String g:i.split("")) {
				for(String j:numbers) {
					if(j.equals(g)) {
						k+=1;
					}
				}
			}
			if(k==0) {
				counter+=1;
			}
		}
		return counter;
	}
    static void printResults(String s) {
    	System.out.println("Аргумент: " + s);
        System.out.println("Кількість слів: " + octStringToInt(s));
    }
}

