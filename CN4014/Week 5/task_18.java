import java.util.Scanner;

public class task_18 {
    public static void main(String[] args){
	int A;

	Scanner scanner = new Scanner(System.in);
	System.out.print("A: ");
	A = scanner.nextInt();

	if(A == 0)
	    System.out.println("NUMBER IS ZERO.");
	else if(A > 0)
	    System.out.println("NUMBER IS POSITIVE.");
	else
	    System.out.println("NUMBER IS NEGATIVE.");	    
    }
}
