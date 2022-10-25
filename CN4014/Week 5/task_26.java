import java.util.Scanner;

public class task_26 {

    public static void main(String[] args){
	int a;

	Scanner scanner = new Scanner(System.in);
	a = scanner.nextInt();

	if(a < 0) a *= -1;

	System.out.println("The absolute value of a is: " + a);
    }
}
