package bai15;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay thang nam (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        
        String[] parts = date.split("/");
        
        System.out.println("Ngay: " + parts[0]);
        System.out.println("Thang: " + parts[1]);
        System.out.println("Nam: " + parts[2]);
        
        scanner.close();
    }
}