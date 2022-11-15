import java.util.*;

public class task_4 {
    public static void main(String[] args){
	System.out.print("Enter a number to check: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();


	if(primeCheck(n)) {
	    System.out.println("The number is a prime.");
	} else {
	    System.out.println("The number is not a prime.");
	}
    }

    public static boolean primeCheck(int n){
	if(n == 0 || n == 1) return false;
	for(int i = 2; i < n; i++){
	    if(n % i == 0) {
		return false;
	    }
	}
	return true;
    }
}
