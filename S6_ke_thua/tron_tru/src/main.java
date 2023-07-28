public class main {
    public static void main(String[] args) {
        circle circle = new circle();
        System.out.println(circle);
        circle = new circle(2.5,"red");
        System.out.println(circle+"dien tich = "+ circle.getArea());


        cylinder cylinder = new cylinder();
        System.out.println(cylinder);
        cylinder = new cylinder(2.5,"red",5);
        System.out.println(cylinder+"the tich ="+ cylinder.getV()+"m3");
    }
}
