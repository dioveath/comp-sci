import java.util.Scanner;

public class task_22 {

    public static void main(String[] args){
	int hours;
	double rate;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Hours: ");
	hours = scanner.nextInt();

	System.out.println("Rate: ");
	rate = scanner.nextDouble();

	double total;
	if(hours > 40){
	    total =  (40 * rate) + (hours - 40) * rate * 1.5;
	} else {
	    total = hours * rate;
	}

	System.out.println("Grass pay: " + total);
    }
}
	
