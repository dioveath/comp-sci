import java.util.Scanner;

public class task_21 {

    public static void main(String[] args){
	double percent;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Percent: ");
	percent = scanner.nextDouble();

	if(percent < 25){
	    System.out.println("Grade: F");
	} else if(percent >= 25 && percent < 45) {
	    System.out.println("Grade: E");
	} else if(percent >= 45 && percent < 50) {
	    System.out.println("Grade: D");
	} else if(percent >= 50 && percent < 60) {
	    System.out.println("Grade: C");
	} else if(percent >= 60 && percent <= 80) {
	    System.out.println("Grade: B");
	} else {
	    System.out.println("Grade: A");	    
	}
    }
}
