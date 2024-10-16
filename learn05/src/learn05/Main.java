package learn05;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đổi độ C sang độ F
		
		  	Scanner scanner = new Scanner(System.in);

	        // Nhập độ C
	        System.out.print("Nhập độ C: ");
	        double celsius = scanner.nextDouble();

	        // Chuyển đổi sang độ F
	        double fahrenheit = (celsius * 1.8) + 32;

	        // Xuất kết quả
	        System.out.printf("%.2f độ C tương đương với %.2f độ F%n", celsius, fahrenheit);

	        scanner.close();
	}

}
