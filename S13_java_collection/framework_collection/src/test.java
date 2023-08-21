import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
//    public static void main(String[] args) {
//        ProductManager pro = new ProductManager();
//        int inp = 0;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("1: add");
//            System.out.println("2: edit");
//            System.out.println("3: delete");
//            System.out.println("4: sort");
//            System.out.println("5. display");
//            System.out.println("6: search");
//            System.out.println("7: EXIT");
//
//            inp = sc.nextInt();
//            switch (inp){
//                case 1:
//                    System.out.println("nhap id");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//                    System.out.println("nhap ten san pham ");
//                    String name = sc.nextLine();
//                    System.out.println("nhap gia");
//                    double price = sc.nextDouble();
//                    sc.nextLine();
//
//                    Product p1 = new Product(id,name,price);
//                    pro.add(p1);
//                    break;
//
//                case 2:
//                    System.out.println("nhap id muon edit");
//                    int x = sc.nextInt();
//                    pro.edit(x);
//
//                    break;
//
//                case 3:
//                    System.out.println("chon id muon xoa");
//                    id = sc.nextInt();
//                    pro.delete(id);
//                    break;
//
//
//                case 4:
//                    System.out.println("1: sortUpByPrice");
//                    System.out.println("2: sortDownByPrice");
//                    int z = sc.nextInt();
//                    if (z==1){
//                        pro.sortUp();
//                    }else if (z==2){
//                        pro.sortDown();
//                    }
//                    break;
//
//
//                case 5:
//                    pro.display();
//                    break;
//
//                case 6:
//                    System.out.println("nhap ten muon search");
//                    String c = sc.nextLine();
//                    sc.nextLine();
//                    pro.searchByName(c);
//                    break;
//
//                default:
//                    System.out.println("retry");
//            }
//        }while(inp != 7);
//    }



    public static void main(String[] args) {
        LinkedList_Product lili = new LinkedList_Product();
        int inp = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: add");
            System.out.println("2: edit");
            System.out.println("3: delete");
            System.out.println("4: sort");
            System.out.println("5. display");
            System.out.println("6: search");
            System.out.println("7: EXIT");

            inp = sc.nextInt();
            switch (inp){
                case 1:
                    System.out.println("nhap id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("nhap ten san pham ");
                    String name = sc.nextLine();
                    System.out.println("nhap gia");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Product p1 = new Product(id,name,price);
                    lili.add(p1);
                    break;

                case 2:
                    System.out.println("nhap id muon edit");
                    int x = sc.nextInt();
                    lili.edit(x);

                    break;

                case 3:
                    System.out.println("chon id muon xoa");
                    id = sc.nextInt();
                    lili.delete(id);
                    break;


                case 4:
                    System.out.println("1: sortUpByPrice");
                    System.out.println("2: sortDownByPrice");
                    int z = sc.nextInt();
                    if (z==1){
                        lili.sortUp();
                    }else if (z==2){
                        lili.sortDown();
                    }
                    break;


                case 5:
                    lili.display();
                    break;

                case 6:
                    System.out.println("nhap ten muon search");
                    String c = sc.nextLine();
                    sc.nextLine();
                    lili.searchByName(c);
                    break;

                default:
                    System.out.println("retry");
            }
        }while(inp != 7);
    }
}
