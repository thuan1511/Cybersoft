package learn03;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tính tổng hai ký số của số nguyên dương n có 2 ký số
		
		Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương n có 2 ký số
        System.out.print("Nhập số nguyên dương n (2 ký số): ");
        int n = scanner.nextInt();

        // Kiểm tra n có đúng 2 ký số không
        if (n < 10 || n > 99) {
            System.out.println("Vui lòng nhập số nguyên dương có 2 ký số.");
        } else {
            // Tính tổng 2 ký số
            int tens = n / 10; // chữ số ở hàng chục
            int units = n % 10; // chữ số ở hàng đơn vị
            int sum = tens + units;

            // Xuất kết quả
            System.out.printf("Tổng hai ký số của %d là: %d%n", n, sum);
        }

        scanner.close();

	}

}
