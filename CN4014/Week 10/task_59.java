import java.util.Scanner; 

class Student {
    String name;
    int id, age;

    public void readDetails(Scanner scanner){
	System.out.print("Name: ");
	name = scanner.nextLine();
	System.out.print("ID: ");	
	id = scanner.nextInt();
	System.out.print("Age: ");
	age = scanner.nextInt();
    }

    public boolean check(int checkId){
	return id == checkId;
    }
    
}


public class task_59 {
    
    public static void main(String[] args){
	Student s = new Student();
	Scanner scanner = new Scanner(System.in);
	s.readDetails(scanner);

	System.out.print("Enter ID to check with previous student:");
	int newCheck = scanner.nextInt();
	
	if(s.check(newCheck)) {
	    System.out.println("It matches.");
	} else {
	    System.out.println("It doesn't match.");	    
	}
    }
}
