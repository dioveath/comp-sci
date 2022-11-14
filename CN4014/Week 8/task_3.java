import java.util.*;

public class task_3 {
    public static void main(String[] args){
	System.out.print("Enter a number: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	System.out.println("The factorial of " + n + " is: " + fact(n));
    }

    public static int fact(int n){
	int f = 1;
	for(int i = 2; i <= n; i++){
	    f *= i;
	}
	return f;
    }
}
