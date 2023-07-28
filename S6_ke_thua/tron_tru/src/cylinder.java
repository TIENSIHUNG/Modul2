public class cylinder extends circle {
    private double height;

    public cylinder() {
    }

    public cylinder(double height) {
        this.height = height;
    }

    public cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getV(){
        double V = Math.PI*getRadius()*getRadius()*height;
        return V;
    }
}
