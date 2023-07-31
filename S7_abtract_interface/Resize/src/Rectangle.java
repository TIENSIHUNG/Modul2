public class Rectangle implements Resizeable {
    private double wid = 3;
    private double hei =2;

    public Rectangle() {
    }

    public double getWid() {
        return wid;
    }

    public void setWid(double wid) {
        this.wid = wid;
    }

    public double getHei() {
        return hei;
    }

    public void setHei(double hei) {
        this.hei = hei;
    }
    public double getArea(){
        return this.wid * this.hei;
    }

    public double getPe(){
        return (this.wid+this.hei)*2;
    }
    @Override
    public String resize(double x) {
        return getArea()*x/100+" va " +getPe()*x/100;
    }
}
