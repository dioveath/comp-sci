import java.util.Scanner;

public class task_20 {

    public static void main(String[] args){
	int quantity, total;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Quantity,");
	quantity = scanner.nextInt();

	total = quantity * 100;

	if(total > 1000)
	    total -= (total/10.0);
	System.out.println("Total cost: " + total);
    }
}
