import java.util.Scanner;

class User {
    private String username;
    private String password;
    

    User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters.");
            return;
        }

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (!hasDigit) {
            System.out.println("Password must contain a digit.");
            return;
        }

        this.password = password;
    }
    String verifyPassword(String enteredPassword){
        if(this.password.equals(enteredPassword)){
            return "password ✔️";
        }
        return "password didnt match";
    }


}

public class PasswordManager {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u1 = new User("Alice", "hello123");
        while(true){
        System.out.println("do u want to verify your password 1.yes 2.no");
        int a = sc.nextInt();
       if (a == 1) {
    System.out.print("Enter password: ");
    String enteredPassword = sc.next();
    System.out.println(u1.verifyPassword(enteredPassword));
}

            sc.close();
        }
    }
}