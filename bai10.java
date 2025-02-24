package bai10;
import java.util.Scanner;
public class bai10{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int x = z.nextInt();
		System.out.println("So chu so trong so la "  + dem(x));
	}
	public static int dem(int x) {
		int dem = 0;
		while (x > 0) {
			dem++;
			x /= 10;
		}
		return dem;
	}
}