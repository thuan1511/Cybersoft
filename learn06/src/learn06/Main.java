package learn06;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cho trước tỉ giá VND-USD là : 23.500đ, viết chương trình nhập vào số USD và tính ra tiền VNĐ.
		
		Scanner scanner = new Scanner(System.in);
        
        final double EXCHANGE_RATE = 23500; // Tỷ giá VND-USD

        // Nhập số USD
        System.out.print("Nhập số USD: ");
        double usd = scanner.nextDouble();

        // Tính tiền VNĐ
        double vnd = usd * EXCHANGE_RATE;

        // Xuất kết quả
        System.out.printf("%.2f USD tương đương với %.2f VND%n", usd, vnd);

        scanner.close();

	}

}
