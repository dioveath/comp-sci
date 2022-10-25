public class task_3 {
    public static void main(String[] args){
	int sum = 0;

	int count = 0;
	for(int i = 3; i <= 100; i+=2){
	    sum += i;
	    count++;
	}

	System.out.println("Count: " + count);
	System.out.println("Sum: " + sum);
    }
}
