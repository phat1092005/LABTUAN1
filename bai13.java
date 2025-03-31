package bai13;
import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        int wordCount = countWords(str);
        System.out.println("Số từ trong chuỗi: " + wordCount);
        scanner.close();
    }
    
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}