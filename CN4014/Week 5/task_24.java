import java.util.Scanner;

public class task_24 {

    public static void main(String[] args){
	int salary, years;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Salary: ");
	salary = scanner.nextInt();

	System.out.println("Years of Service: ");
	years = scanner.nextInt();

	int total;

	total = salary * years;
	if(years > 5){
	    total += salary * 0.05;
	}

	System.out.println("Total Salary: " + total);
    }
}
