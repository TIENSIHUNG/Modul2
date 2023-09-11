import java.io.*;
import java.util.Scanner;

public class read_write {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao source");
            String soureFile = sc.nextLine();
            System.out.println("nhap file dich");
            String targetFile = sc.nextLine();
            if (!new File(soureFile).exists()){
                System.err.println("tep tin loi hoac sai link");
                System.exit(0);
            }
            if (new File(targetFile).exists()){
                System.out.println("file ton tai. Co muon ghi khong (Y/N)");
                String x = reader.readLine().toLowerCase();
                if (!x.equals("y")){
                    System.out.println("cancled");
                    System.exit(0);
                }
            }
             input = new FileInputStream(soureFile);
            output = new FileOutputStream(targetFile);

            int byteRead = input.read();
            while (byteRead != -1){
                output.write(byteRead);
                count++;
                byteRead = input.read();
            }
            System.out.println("copi "+count+" ki tu ");

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if (input!=null){
                    input.close();
                }
                if (output != null) {
                    output.close();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
