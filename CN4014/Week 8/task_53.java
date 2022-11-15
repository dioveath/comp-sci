import java.util.*;

public class task_53 {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	// System.out.print("Enter Array Size Row(M): ");
	// int m = scanner.nextInt();

	// System.out.print("Enter Array Size Column(N): ");
	// int n = scanner.nextInt();

	int m = 3, n = 3;
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

	for(int i = 0; i < n/2; i++){
	    for(int k = 0; k < i; k++) System.out.print("  ");
	    System.out.print(array[i][i] + " ");
	    if(i == m-i-1) {
		System.out.println();
		continue;		
	    }
	    for(int k = i+1; k < m-i; k++) System.out.print("  ");
	    System.out.print(array[i][m-i-1] + " ");
	    // for(int k = m-i; k < m; k++) System.out.print("  ");
	    System.out.println();
	}

	for(int i = n/2; i < n; i++){
	    for(int k = i; k < m-i; k++) System.out.print("  ");
	    System.out.print(array[i][m-i-1] + " ");

	    if(i == m-i-1) continue;
	    for(int k = i+1; k < i; k++) System.out.print("  ");
	    System.out.print(array[i][i] + " ");

	    System.out.println();
	}		

    }

}

