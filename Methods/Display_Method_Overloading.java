// Display Method Overloading
 // Author - Saravana
public class Display_Method_Overloading {
	public static void display(int number) {
		System.out.print("Integer: " + number);
	}

	public static void display(String text) {
		System.out.print("String: " + text);
	}

	public static void main(String[] args) {
		display(10);
		display("Java");
	}
}
