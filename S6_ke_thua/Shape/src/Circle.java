public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double S = radius *radius * Math.PI;
        return S;
    }
    public double getPerimeter(){
        double C = radius*2*Math.PI;
        return C;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" +getRadius()+"which is a subclass of "+super.toString();
    }
}
