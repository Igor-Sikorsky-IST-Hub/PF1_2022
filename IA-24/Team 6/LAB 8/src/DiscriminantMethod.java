import java.lang.Math;
public class DiscriminantMethod extends QuadraticEquation{
	private double D;
	DiscriminantMethod(double a, double b, double c){
		super(a, b, c);
		this.D = Math.pow(b,2) - 4 * a * c;
	}
	DiscriminantMethod(double a, double b){
		super(a, b);
		this.D = Math.pow(b,2) - 4 * a * getC();
	}
	DiscriminantMethod(double a){
		super(a);
		this.D = Math.pow(getB(),2) - 4 * a * getC();
	}
	DiscriminantMethod(){
		super();
		this.D = Math.pow(getB(),2) - 4 * getA() * getC();
	}
	
	public String Solve() {
		if (D == 0){
			x1 = (-getB() + Math.sqrt(D))/(2*getA());
			return "x = " + x1;
		}
		if (D < 0){
			return "Коренів немає";
		}
		x1 = (-getB() + Math.sqrt(D))/(2*getA());
		x2 = (-getB() - Math.sqrt(D))/(2*getA());
		return "x1 = " + x1 + ", x2 = " + x2;
	}
	
	@Override
	public String toString() {    	
	    return super.toString() + "\n" + Solve();	
	}
}
