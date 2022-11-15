import java.util.*;

public class task_5 {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number A: ");
	int a = scanner.nextInt();

	System.out.print("Enter a number B: ");	
	int b = scanner.nextInt();

	System.out.println("The greatest number is " + greatest(a, b) + ".");
    }


    public static int greatest(int a, int b) {
	return a > b ? a : b;
    }

}
