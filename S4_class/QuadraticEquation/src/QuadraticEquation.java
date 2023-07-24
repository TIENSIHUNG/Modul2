import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    public double getDiscriminant(){
        double delta = (b*b) -(4*a*c);
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b+(Math.sqrt(b*b-4*a*c))/(2*a));
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b-(Math.sqrt(b*b-4*a*c))/(2*a));
        return r2;
    }
    public double getRoot0(){
        double r0 = -b/(2*a);
        return r0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap lan luot a,b,c");
        double a = Double.valueOf(sc.nextLine()) ;
        double b = Double.valueOf(sc.nextLine());
        double c = Double.valueOf(sc.nextLine());

        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("vo nghiem");
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("pt co nghiem: "+quadraticEquation.getRoot0());
        }else{
            System.out.println("pt co 2 nghiem:"+quadraticEquation.getRoot1()+" va "+quadraticEquation.getRoot2());
        }

    }

}
