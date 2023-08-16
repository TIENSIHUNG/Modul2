import java.util.Arrays;

public class TreeMap {

    public static void main(String[] args) {
        // Tạo một TreeMap để lưu trữ các từ và số lần xuất hiện của chúng
        java.util.TreeMap<String, Integer> wordMap = new java.util.TreeMap<>();

        // Tạo một chuỗi để thử nghiệm
        String text = "Hello world hello Java hello TreeMap";

        // Tách chuỗi thành các từ bằng cách sử dụng dấu cách làm ký tự phân tách
        String[] words = text.split(" ");

        // Duyệt qua mảng các từ
        for (String word : words) {
            // Chuyển đổi từ sang chữ thường để đồng nhất
            word = word.toLowerCase();

            // Nếu TreeMap đã chứa từ đó, tăng số lần xuất hiện của nó lên 1
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word); // Lấy số lần xuất hiện hiện tại của từ
                wordMap.put(word, count + 1); // Cập nhật số lần xuất hiện mới của từ
            } else {
                // Nếu TreeMap chưa chứa từ đó, thêm từ đó vào với số lần xuất hiện là 1
                wordMap.put(word, 1);
            }
        }

        // Hiển thị kết quả
        System.out.println(Arrays.toString(text.split(" ")));
        System.out.println("Các từ và số lần xuất hiện của chúng là:");
        System.out.println(wordMap);
    }
}
