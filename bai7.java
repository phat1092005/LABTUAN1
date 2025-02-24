package bai7;
import java.util.Scanner;
public class bai7{
	public static void main(String[]args){
		Scanner x = new Scanner(System.in);
		System.out.println("Nhap diem 5 mon , hoa, sinh, toan, may tinh: ");
		double a = x.nextDouble();
		double b = x.nextDouble();
		double c = x.nextDouble();
		double d = x.nextDouble();
		double e = x.nextDouble();
		double y = (((a + b + c + d + e) / 50)*100);
		char hang;
		if (y > 90) {
			hang = 'A';
		} else if ((y > 80) && (y < 90)){
			hang = 'B';
		} else if ((y > 70) && (y < 80)){
			hang = 'C';
		} else if ((y > 60) && (y < 70)){
			hang = 'D';
		} else if ((y > 40) && (y < 60)){
			hang = 'E';
		} else {
			hang = 'F';
		}
		System.out.println("Ty le phan tram la "+ y + "%");
		System.out.println("Hang la " + hang);
		}
	}