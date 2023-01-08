public class QuadraticEquation {
	private double a;
    private double b;
    private double c;
    protected double x1;
    protected double x2;
    
    QuadraticEquation(){
    	this.a = 1;
    	this.b = 0;
    	this.c = 0;
    }
    QuadraticEquation(double a, double b, double c){
    	this.a = a;
    	this.b = b;
    	this.c = c;
    }
    QuadraticEquation(double a, double b){
    	this.a = a;
    	this.b = b;
    	this.c = 0;
    }
    QuadraticEquation(double a){
    	this.a = a;
    	this.b = 0;
    	this.c = 0;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }    
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    @Override
    public String toString() {
    	String res = a + "x^2 ";
    	if(b>0) {
    		res += "+" + b + "x";
    	} else if((b<0)){
    		res += b + "x";
    	}
    	if(c>0) {
    		res += " +" + c;
    	} else if((c<0)){
    		res += " " + c;
    	}
        return res + " = 0";
    }
}
