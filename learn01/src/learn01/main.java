package learn01;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		// Viết chương trình tính chiều dài cạnh huyền của một tam giác vuông khi biết 2 cạnh góc vuông.
		
		Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài 2 cạnh góc vuông
        System.out.print("Nhập chiều dài cạnh a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập chiều dài cạnh b: ");
        double b = scanner.nextDouble();

        // Tính chiều dài cạnh huyền
        double hypotenuse = Math.sqrt(a * a + b * b);

        // Xuất kết quả
        System.out.printf("Chiều dài cạnh huyền là: %.2f%n", hypotenuse);

        scanner.close();
	}

}
