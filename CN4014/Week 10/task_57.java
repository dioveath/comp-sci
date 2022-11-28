import java.util.Scanner;

public class task_57 {
    public static void main(String[] args){
	Square s = new Square();
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Length: ");
	int l = scanner.nextInt();

	s.setLength(l);

	System.out.println("The area of the box:  " + s.getArea());
	System.out.println("The perimeter of the box:  " + s.getPerimeter());	
    }
}


class Square {
    int l;

    public void setLength(int len){
	this.l = len;
    }

    public int getArea(){
	return l * l;
    }

    public int getPerimeter(){
	return 2 * l;
    }
}
