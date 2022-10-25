import java.util.Scanner;

public class task_17 {
    public static void main(String[] args){
	int A, B;

	Scanner scanner = new Scanner(System.in);
	System.out.print("A: ");
	A = scanner.nextInt();
	System.out.print("B: ");	
	B = scanner.nextInt();

	if(A == B)
	    System.out.println("NUMBERS ARE EQUAL.");
	else
	    System.out.println("NUMBERS ARE NOT EQUAL.");
    }
}
