import java.util.Scanner;

public class task_27 {

    public static void main(String[] args){
	int classesHeld, classesAttended;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Classes Held: " );
	classesHeld = scanner.nextInt();

	System.out.print("Classes Attended: " );	
	classesAttended = scanner.nextInt();

	double percent = classesAttended/(double)classesHeld * 100;

	if(percent < 75)
	    System.out.println("Student is not allowed.");
	else
	    System.out.println("Student is allowed.");	    
    }
    
}
