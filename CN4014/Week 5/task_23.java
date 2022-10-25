import java.util.Scanner;

public class task_23 {

    public static void main(String[] args){
	int a, b, c;

	Scanner scanner = new Scanner(System.in);
	System.out.println("A: ");
	a = scanner.nextInt();

	System.out.println("B: ");
	b = scanner.nextInt();

	System.out.println("C: ");
	c = scanner.nextInt();	

	if(a > b && a > c) {
	    System.out.println("A is the largest.");
	} else if(b > a && b > c) {
	    System.out.println("B is the largest.");
	} else {
	    System.out.println("C is the largest.");	    
	}

    }
}
	
