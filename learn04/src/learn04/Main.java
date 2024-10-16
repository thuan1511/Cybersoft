package learn04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tính giá trị trung bình của 5 số
		
		Scanner scanner = new Scanner(System.in);
        final int NUM_COUNT = 5; // Hằng số số lượng số cần nhập
        int sum = 0; // Biến tích lũy để tính tổng

        // Nhập 5 số và tính tổng
        for (int i = 1; i <= NUM_COUNT; i++) {
            System.out.print("Nhập số thứ " + i + ": ");
            int number = scanner.nextInt(); // Nhập số nguyên
            sum += number; // Cộng dồn vào tổng
        }

        // Tính giá trị trung bình (ép kiểu về double để tính chính xác)
        double average = (double) sum / NUM_COUNT;

        // Xuất kết quả
        System.out.printf("Giá trị trung bình của 5 số là: %.2f%n", average);

        scanner.close();
	}

}
