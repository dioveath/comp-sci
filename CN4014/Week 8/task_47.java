import java.util.*;

public class task_47 {
    public static void main(String[] args){
	System.out.print("Enter Array Size: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	int array[] = new int[n];
	for(int i = 0; i < n; i++){
	    System.out.print("Enter " + (i+1) + "th Element: ");	    
	    array[i] = scanner.nextInt();
	}

	int sum = 0;
	for(int i = 0; i < n; i++){
	    sum += array[i];
	}

	System.out.println("The sum of all the elements in array is " + sum + ".");
    }

}
