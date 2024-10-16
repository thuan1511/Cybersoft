package learn02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình tính giá trị đơn thức P(x) = ax^n (a là số thực, n là số nguyên không âm ) với x8 cho trước. (Sử dụng thư viện Math)
		
		Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và số mũ n
        System.out.print("Nhập hệ số a (số thực): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số mũ n (số nguyên không âm): ");
        int n = scanner.nextInt();

        // Nhập giá trị x
        System.out.print("Nhập giá trị x: ");
        double x = scanner.nextDouble();

        // Tính giá trị P(x)
        double result = a * Math.pow(x, n);

        // Xuất kết quả
        System.out.printf("Giá trị của P(x) = %.2f%n", result);

        scanner.close();

	}

}
