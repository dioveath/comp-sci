import java.util.Scanner;

public class program_6 {
    public static void main(String[] args){
	int num1, num2, temp;

	Scanner scanner = new Scanner(System.in);
	System.out.print("NUM1: ");
	num1 = scanner.nextInt();
	System.out.print("NUM2: ");	
	num2 = scanner.nextInt();

	temp = num1;
	num1 = num2;
	num2 = temp;

	System.out.println("NUM1: " + num1);
	System.out.println("NUM2: " + num2);
    }
}
