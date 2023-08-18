import java.util.*;

public class ProductManager {
    private ArrayList<Product> arr;
    Scanner sc = new Scanner(System.in);


    public ProductManager() {
        this.arr = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> arr) {
        this.arr = arr;
    }
    public void add(Product product){
        this.arr.add(product);
    }

    public void display(){
        for (Product product :
                arr) {
            System.out.println(product.toString());
        }
    }

    public void edit(int id){
        for (Product product :
                arr) {
            if (product.getId() == id){
                System.out.println("nhap ten");
                product.setName(sc.nextLine());
                System.out.println("nhap gia");
                product.setPrice(sc.nextDouble());
                return;
            }else{
                System.out.println("cant find");
                return;
            }
        }
    }

    public boolean delete(int id){
        for (Product product: arr) {
            if(product.getId() == id){
                arr.remove(product);
                return  true;
            }

        }
        return false;
    }

    public void sortUp(){
        Collections.sort(arr, new Comparator<Product>() {
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
        Collections.sort(arr, new Comparator<Product>() {
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

    public void searchByName(String name){
        for (Product product: arr
             ) { if (product.getName()==name){
            System.out.println(" san pham co id = " +product.getId());
            return;
        }else {
            System.out.println("cant find");
            return;
        }

        }
    }


}
