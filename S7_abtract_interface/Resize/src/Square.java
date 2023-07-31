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
        return getArea()*x/100+" va "+getPe()*x/100;
    }
}
