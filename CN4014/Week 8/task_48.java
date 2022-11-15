import java.util.*;

public class task_48 {
    public static void main(String[] args){
	System.out.print("Enter Array Size: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	int array[] = new int[n];
	for(int i = 0; i < n; i++){
	    System.out.print("Enter " + (i+1) + "th Element: ");	    
	    array[i] = scanner.nextInt();
	}

	int max = 0;
	for(int i = 0; i < n; i++){
	    if(max < array[i]) max = array[i];
	}

	System.out.println("The greatest element in array is " + max + ".");
    }

}
