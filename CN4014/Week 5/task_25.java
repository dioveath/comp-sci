import java.util.Scanner;

public class task_25 {

    public static void main(String[] args){
	int a, b, c;

	Scanner scanner = new Scanner(System.in);
	System.out.println("User A: ");
	a = scanner.nextInt();

	System.out.println("User B: ");
	b = scanner.nextInt();

	System.out.println("User C: ");
	c = scanner.nextInt();	

	if(a > b && a > c) {
	    System.out.println("User A is the oldest.");
	} else if(b > a && b > c) {
	    System.out.println("User B is the oldest.");
	} else {
	    System.out.println("User C is the oldest.");	    
	}

	if(a < b && a < c) {
	    System.out.println("User A is the youngest.");
	} else if(b < a && b < c) {
	    System.out.println("User B is the youngest.");
	} else {
	    System.out.println("User C is the youngest.");	    
	}	

    }
}
	
