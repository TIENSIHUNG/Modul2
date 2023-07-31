public class Square implements Resizeable {
    private double x =2;

    public Square() {
    }

    public Square(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public double getArea(){
        return this.x*this.x;
    }
    public double getPe(){
        return this.x*4;
    }


    @Override
    public String resize(double x) {
        setX(this.x*x);
        return "S="+ getArea()+"va C="+getPe() ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                '}';
    }
}
