import java.util.Scanner;

public class task_1 {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Length: ");
	int l = scanner.nextInt();
	System.out.print("\nBreadth: ");	
	int b = scanner.nextInt();
	System.out.print("\nHeight: ");		
	int h = scanner.nextInt();

	Box box = new Box(l, b, h);

	System.out.println("The volume of the box:  " + box.getVolume());
    }
}


class Box {
    int l, b, h;
    public Box(int l, int b, int h) {
	this.l = l;
	this.b = b;
	this.h = h;
    }

    public int getVolume(){
	return l * b * h;
    }
}
