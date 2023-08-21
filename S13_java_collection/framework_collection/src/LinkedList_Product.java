import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Product {
    private LinkedList<Product> lili;
    Scanner sc = new Scanner(System.in);

    public LinkedList_Product() {
        this.lili= new LinkedList<>();
    }

    public LinkedList_Product(LinkedList<Product> lili) {
        this.lili = lili;
    }

    public void add(Product product){
        lili.addFirst(product);
    }

    public void edit(int id){
        for (Product product :
                lili) {
            if (product.getId() == id) {
                System.out.println("nhap lai ten");
                product.setName(sc.nextLine());
                sc.nextLine();
                System.out.println("nhap lai gia");
                product.setPrice(sc.nextDouble());
                sc.nextLine();
                return;
            }else {
                System.out.println("cant find");
                return;
            }
        }
    }

    public void display(){
        for (Product product :
                lili) {
            System.out.println(product.toString());
        }
    }

    public void delete(int id){
        for (Product product: lili) {
            int index;
            if(product.getId() == id){
                index = lili.indexOf(product);
                lili.remove(index);
                break;
            }
        }
    }

    public void sortUp(){
        Collections.sort(lili, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() < o2.getPrice()){
                    return -1;
                }
                return 0;
            }
        });
    }
    public void sortDown(){
        Collections.sort(lili, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()){
                    return 1;
                }else if (o1.getPrice() > o2.getPrice()){
                    return -1;
                }
                return 0;
            }
        });
    }

    public Product searchByName(String c) {
        for (Product product : lili) {
            if (product.getName()==c){
                return product;
            }
        }
        return null;
    }
}
