public class Circle implements Resizeable {
    private double r = 1;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getArea(){
        return Math.PI * this.r*this.r;
    }
    public double getPe(){
        return  this.r *2 * Math.PI;
    }

    @Override
    public String resize(double x) {
        return getArea()*x/100+"va"+getPe()*x/100 ;
    }


}
