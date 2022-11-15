import java.util.*;

public class task_52 {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Array Size Row(M): ");
	int m = scanner.nextInt();

	System.out.print("Enter Array Size Column(N): ");
	int n = scanner.nextInt();	

	int array[][] = new int[m][n];
	for(int i = 0; i < m; i++){
	    System.out.println("In " + (i+1) + "th Row: ");
	    for(int j = 0; j < n; j++){
		System.out.print("In " + (j+1) + "th Column: ");		
		array[i][j] = scanner.nextInt();
		System.out.println();
	    }
	    System.out.println();
	}

	for(int i = 0; i < m; i++){
	    int rowSum = 0;
	    for(int j = 0; j < n; j++){
		System.out.print(array[i][j] + "  ");
		rowSum += array[i][j];
	    }
	    System.out.println("  =  " + rowSum);
	}	

    }

}

