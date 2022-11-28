import java.util.Scanner;

public class task_58 {
    public static void main(String[] args){
	BankAcct ba = new BankAcct();
	Scanner scanner = new Scanner(System.in);

	System.out.print("Customer Name: ");
	String name = scanner.nextLine();
	
	
	System.out.print("Deposit Amount: ");
	int dep = scanner.nextInt();

	ba.deposit(dep);
	ba.getDetails();

	System.out.print("Withdraw Amount: ");	
	int wd = scanner.nextInt();
	ba.withdraw(wd);
	ba.getDetails();
    }
}


class BankAcct {
    String customerName;
    int customerId;
    int amount;

    public void getDetails(){
	System.out.println(customerId + ". " + customerName);
	System.out.println("Amount  :" + amount);	
    }

    public void setName(String name){
	this.customerName = name;
    }


    public void deposit(int amt){
	this.amount += amt;
    }

    public void withdraw(int amt){
	this.amount -= amt;
    }
}
