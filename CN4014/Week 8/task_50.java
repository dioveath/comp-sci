import java.util.*;

public class task_50 {
    public static void main(String[] args){
	System.out.print("Enter Array Size: ");
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	int array[] = new int[n];
	for(int i = 0; i < n; i++){
	    System.out.print("Enter " + (i+1) + "th Element: ");	    
	    array[i] = scanner.nextInt();
	}

	for(int i = 0; i < n; i++){
	    for(int j = i+1; j < n; j++){
		if(array[i] > array[j]){
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		}
	    }
	}


	System.out.println("Sorted array is: ");
	for(int i = 0; i < n; i++){
	    System.out.print(array[i] + " ");
	}

    }

}
