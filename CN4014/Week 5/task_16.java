import java.util.Scanner;

public class task_16 {
    public static void main(String[] args){
	double A, B, C;

	Scanner scanner = new Scanner(System.in);
	System.out.print("A: ");
	A = scanner.nextDouble();
	System.out.print("B: ");	
	B = scanner.nextDouble();
	System.out.print("C: ");	
	C = scanner.nextDouble();	

	double percent = (A+B+C)/3.0;

	if(percent > 50)
	    System.out.println("PASS");
	else
	    System.out.println("FAIL");
    }
}
