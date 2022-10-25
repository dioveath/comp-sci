import java.util.Scanner;

public class task_19 {
    public static void main(String[] args){
	int len1, wid1;
	int len2, wid2;
	int area1, area2;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Dimension of First Rectangle,");	
	System.out.print("Length: ");
	len1 = scanner.nextInt();
	System.out.print("Width: ");
	wid1 = scanner.nextInt();

	System.out.println("Dimension of Second Rectangle,");	
	System.out.print("Length: ");
	len2 = scanner.nextInt();
	System.out.print("Width: ");
	wid2 = scanner.nextInt();

	area1 = len1 * wid1;
	area2 = len2 * wid2;


	if(area1 == area2)
	    System.out.println("AREAS ARE THE SAME.");
	else if(area1 > area2)
	    System.out.println("FIRST RECTANGLE HAS GREATER AREA.");
	else
	    System.out.println("SECOND RECTANGLE HAS GREATER AREA.");	    
    }
}
