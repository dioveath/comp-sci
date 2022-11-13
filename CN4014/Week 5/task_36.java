import java.util.*;

public class task_36 {
    public static void main(String[] args){
	System.out.print("Enter a number to check: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	for(int i = 2; i < n; i++){
	    if(n % i == 0) {
		System.out.println("The number is not prime.");
		return;
	    }
	}

	System.out.println("The number is a prime.");
    }
}
