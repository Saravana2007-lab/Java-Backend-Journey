// Area Calculator using Method Overloading
// Author - Saravana
public class Area_Calculator_Overloading {
	public static int area(int side) {
		return side * side;
	}

	public static int area(int length, int breadth) {
		return length * breadth;
	}

	public static void main(String[] args) {
		System.out.println(area(5));       
		System.out.println(area(10, 20)); 
	}
}
