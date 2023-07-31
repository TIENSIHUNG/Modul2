package Shape;

import Shape.Shape;

public class Test {
    public static void main(String[] args) {

        Square squ1 = new Square(4);
        squ1.howToColor();

        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Colorable){
                ((Colorable) shape[i]).howToColor();
            }else{
                System.out.println(shape[i]);
            }
        }

    }
}
