import java.util.*;

public class task_34 {
    public static void main(String[] args){
	System.out.print("Enter a number to check: ");
	Scanner scanner = new Scanner(System.in);
	int inputNumber = scanner.nextInt();

	if(inputNumber < 0 && inputNumber > 999) {
	    System.out.println("The number is not armstrong number.");
	    return;
	} 

	int n = inputNumber;
	int cubeSum = 0;
	while(n != 0) {
	    int d = n % 10;
	    cubeSum += d * d * d;
	    n /= 10;
	}

	if(cubeSum == inputNumber) {
	    System.out.println("The number is armstrong number.");
	} else {
	    System.out.println("The number is not armstrong number.");	    
	}
    }
}
