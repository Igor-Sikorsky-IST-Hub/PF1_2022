public class MainProgramm {
	public static void main(String[] args) {
		DiscriminantMethod first = new DiscriminantMethod(4,5,6);
		System.out.println(first.toString());
		DiscriminantMethod sec = new DiscriminantMethod(-2, 0, 6);
		System.out.println(sec.toString());
		DiscriminantMethod third = new DiscriminantMethod(1, -3, 2);
		System.out.println(third.toString());
		DiscriminantMethod fourth = new DiscriminantMethod(5);
		System.out.println(fourth.toString());
	}
}
