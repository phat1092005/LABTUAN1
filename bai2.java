package bai2;
import java.util.Scanner;
public class bai2{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double x = z.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double y = z.nextDouble();
		double s = x * y;
		System.out.println("Dien tich la: "+ s);
	}
}
