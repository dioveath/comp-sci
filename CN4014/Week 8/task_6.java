import java.util.*;

public class task_6 {
    public static void main(String[] args){
	System.out.print("Enter a number to check: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();


	if(isArmstrong(n)){
	    System.out.println("The number is armstrong number.");
	} else {
	    System.out.println("The number is not armstrong number.");	    
	}
    }

    public static boolean isArmstrong(int n){
	if(n < 0 && n > 999) return false;
	int cubeSum = 0, num = n;
	while(n != 0) {
	    int d = n % 10;
	    cubeSum += d * d * d;
	    n /= 10;
	}
	return cubeSum == num;
    }
}
