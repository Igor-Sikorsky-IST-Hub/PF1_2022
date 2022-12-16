public class Coordinates {
    private double x,y,z;
    Coordinates(){
    }
    Coordinates(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void findVectorLength(){
    }
    double findVectorLength(double x, double y, double z){
        double len = Math.sqrt(x*x + y*y + z*z);
        return len;
    }
}
