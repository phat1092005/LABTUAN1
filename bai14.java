package bai14;
import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        
        String[] parts = fullName.trim().split("\\s+");
        
        System.out.println("Họ: " + parts[0]);
        System.out.println("Tên: " + parts[parts.length - 1]);
        String middleName = "";
        for (int i = 1; i < parts.length - 1; i++) {
            middleName += parts[i] + " ";
        }
        System.out.println("Tên đệm: " + middleName.trim());
        
        scanner.close();
    }
}